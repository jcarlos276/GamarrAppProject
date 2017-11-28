package com.guillen.gamarrapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.guillen.gamarrapp.model.Tienda;
import com.guillen.gamarrapp.model.Usuario;
import com.guillen.gamarrapp.servicios.TiendaService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private TiendaService tiendaService;
	
//	@GetMapping("/")
//	public ModelAndView index() {
//		Tienda tda = new Tienda();
//		ModelAndView model = new ModelAndView("listTienda", "command", tda);
//		return model;
//	}
	
	@GetMapping("/usr")
	public String list(@ModelAttribute("SpringWeb") Tienda tienda, ModelMap model) {

		try {
			model.addAttribute("tiendas", tiendaService.findAllTiendas());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "usr/tiendas";
	}
	
	@GetMapping("/mi-tienda")
	public ModelAndView userTienda() {
		Usuario usr = new Usuario();
		ModelAndView model = new ModelAndView("usr/tienda", "command", usr);
		return model;
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		Usuario usr = new Usuario();
		ModelAndView model = new ModelAndView("welcome", "command", usr);
		return model;
	}

}
