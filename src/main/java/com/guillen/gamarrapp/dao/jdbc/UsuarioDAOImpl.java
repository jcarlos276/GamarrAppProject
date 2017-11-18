package com.guillen.gamarrapp.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guillen.gamarrapp.dao.UsuarioDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.exception.LoginException;
import com.guillen.gamarrapp.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario findUsuario(int id) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(String fullname, String dni, String email, String password) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String fullname, String dni, String email, String password) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findEmployeeByDni(String dni) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findEmployeeByFullname(String fullname) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllEmployees() throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario validate(String email, String password) throws LoginException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	

}

