package com.guillen.gamarrapp.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guillen.gamarrapp.dao.UsuarioDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Usuario;

@Service
public class SecurityServiceImpl implements SecurityService{
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario validate(String login, String password) throws LoginException, DAOException {

		Usuario usuario = usuarioDAO.validate(login, password);

		return usuario;
	}	
	
}
