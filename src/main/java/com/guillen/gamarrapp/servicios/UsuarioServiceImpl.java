package com.guillen.gamarrapp.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guillen.gamarrapp.dao.UsuarioDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDao;

	@Override
	public Usuario findUsuario(int id) throws DAOException, EmptyResultException {
		Usuario usuario = usuarioDao.findUsuario(id);
		return usuario;
	}

	@Override
	public void create(String fullname, String dni, String email, String password) throws DAOException {
		usuarioDao.create(fullname, dni, email, password);		
	}

	@Override
	public void delete(String email) throws DAOException {
		usuarioDao.delete(email);
		
	}

	@Override
	public void update(String fullname, String dni, String email, String password) throws DAOException {
		usuarioDao.update(fullname, dni, email, password);		
	}

	@Override
	public Usuario findUsuarioByDni(String dni) throws DAOException, EmptyResultException {
		Usuario usuario = usuarioDao.findUsuarioByDni(dni);
		return usuario;
	}

	@Override
	public Usuario findUsuarioByFullname(String fullname) throws DAOException, EmptyResultException {
		Usuario usuario = usuarioDao.findUsuarioByFullname(fullname);
		return usuario;
	}

	@Override
	public Usuario validate(String email, String password) throws LoginException, DAOException, EmptyResultException {
		Usuario usuario = usuarioDao.validate(email, password);
		return usuario;
	}

}
