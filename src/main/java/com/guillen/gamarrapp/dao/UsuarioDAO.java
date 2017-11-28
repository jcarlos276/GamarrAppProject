package com.guillen.gamarrapp.dao;

import java.util.List;

import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Usuario;



public interface UsuarioDAO {
	
	Usuario findUsuario(int id) throws DAOException, EmptyResultException;

	void create(String fullname, String dni, String email, String password) throws DAOException;

	void delete(String email) throws DAOException;

	void update(String fullname, String dni, String email, String password) throws DAOException;

	Usuario findUsuarioByDni(String dni) throws DAOException, EmptyResultException;
	
	Usuario findUsuarioByFullname(String fullname) throws DAOException, EmptyResultException;

	Usuario validate(String email, String password) throws LoginException, DAOException;

}