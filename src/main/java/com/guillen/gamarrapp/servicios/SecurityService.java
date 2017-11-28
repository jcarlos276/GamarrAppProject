package com.guillen.gamarrapp.servicios;

import org.springframework.stereotype.Service;

import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Usuario;

public interface SecurityService {
	
	Usuario validate(String email, String password) throws LoginException, DAOException;
	
}
