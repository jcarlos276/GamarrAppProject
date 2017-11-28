package com.guillen.gamarrapp.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;
import javax.xml.validation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.guillen.gamarrapp.dao.jdbc.UsuarioDAOImpl;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.ResponseMessage;
import com.guillen.gamarrapp.model.Usuario;
import com.guillen.gamarrapp.servicios.ApiService;
import com.guillen.gamarrapp.servicios.ApiServiceGenerator;
import com.guillen.gamarrapp.servicios.SecurityService;
import com.guillen.gamarrapp.servicios.UsuarioService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/login")
	public ModelAndView index() {
		Usuario usr = new Usuario();
		ModelAndView model = new ModelAndView("login", "command", usr);
		return model;
	}

	@PostMapping("/login")
	public String login (ModelMap model,@RequestParam(value ="email")String email,
			@RequestParam(value ="password")String password) throws IOException {
		String vista="";
		
		logger.info("email:"+email);
		logger.info("psw:"+password);
		
		ApiService service = ApiServiceGenerator.createService(ApiService.class);
		Call<Usuario> call = null;
				
				call=service.validate(email, password);
		
		//
  	
	  	Response<Usuario> response=call.execute();
	  	
	  	 try {
	         int statusCode = response.code();
	         logger.info("HTTP status code: " + statusCode);
	         
	         if (response.isSuccessful()) {
	        	 
	             Usuario usuario = response.body();
	             logger.info("responseMessage: " + usuario);
	             logger.info("Login correcto");
	         
//	            httpSession.setAttribute("usuario",usuario);
	          
	           
	           vista="/usr/tiendas";
	          
	         } else {
	             
	        	 logger.info("Login incorrecto");
	        	 logger.info("onError: " + response.errorBody().string());
	        	 
	        	model.addAttribute("message", "Username o password incorrectos");
	             
	        	 //Devolvemos vista
	        	 vista="login";
		            logger.info("recibiendo el mensaje:"+ vista);
		         
	         }

	     }catch (Throwable t) {
	         		try {
	         			logger.info("Error tipo T");
	         			logger.info("onThrowable: " + t.toString());
	         			logger.info("onThrowable: " + t.toString(), t);
	        	
	         			model.addAttribute("message", t.getMessage());
	         			vista="login";
	        	         
	             
	         		} catch (Throwable x) {
	         					}
	     } 
		
		
		//
		
		logger.info("Post-Login with api");
		

		return vista;
	}
	
	@GetMapping("/register")
	public ModelAndView registerForm() {
		
		Usuario usr = new Usuario();
		ModelAndView model = new ModelAndView("register", "command", usr);
		return model;
		
	}
	
	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute("usuario") @Valid Usuario usuario, BindingResult result, ModelMap model) {
		
		ModelAndView modelAndView = null;
		
		if (result.hasErrors()) {
			logger.info("result.getAllErrors(); = " + result.getAllErrors());
			
			for (ObjectError error : result.getAllErrors()) {
				String theMessage = context.getMessage(error.getCode(), error.getArguments(), Locale.US);
				logger.info(error.getCode() + " = " + theMessage);
			}
			
			modelAndView = new ModelAndView("register", "usuario", usuario);

		} else {
			try {
				usuarioService.create(usuario.getFullname(), usuario.getDni(), usuario.getEmail(), usuario.getPassword());
				logger.info("new Usuario = " + usuario.getFullname());
				modelAndView = new ModelAndView("redirect:/welcome");

			} catch (DAOException e) {
				logger.error(e.getMessage());
				model.addAttribute("message", e.getMessage());
				modelAndView = new ModelAndView("register", "employee", usuario);
			}
		}
		
		return modelAndView;
		
	}
	
}
