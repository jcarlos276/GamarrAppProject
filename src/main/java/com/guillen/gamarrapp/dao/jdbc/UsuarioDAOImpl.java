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
import com.guillen.gamarrapp.mapper.UsuarioMapper;
import com.guillen.gamarrapp.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario findUsuario(int usuarioId) throws DAOException, EmptyResultException {
		String query = "SELECT id, nombre, dni, email, password FROM comerciante WHERE id = ?";

		Object[] params = new Object[] { usuarioId };

		try {

			Usuario usr = (Usuario) jdbcTemplate.queryForObject(query, params, new UsuarioMapper());
			//
			return usr;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String fullname, String dni, String email, String password) throws DAOException {
		
		String query = "INSERT INTO comerciante (nombre, dni, email, password)  VALUES ( ?,?,?,? )";

		Object[] params = new Object[] { fullname, dni, email, password };
		
		try {
			// create
			jdbcTemplate.update(query, params);

		} catch (Exception e) {
			logger.error("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void delete(String email) throws DAOException {

		String query = "DELETE FROM  comerciante WHERE email = ? ";

		Object[] params = new Object[] { email };

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(String fullname, String dni, String email, String password) throws DAOException {

		String query = "UPDATE comerciante SET nombre = ?, dni =?, email = ?, password = ? WHERE email = ?";

		Object[] params = new Object[] { fullname, dni, email, password };

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public Usuario findUsuarioByDni(String dni) throws DAOException, EmptyResultException {
		
				String query = "SELECT id, nombre, dni, email, password FROM comerciante WHERE dni = ?";

				Object[] params = new Object[] { dni };

				try {

					Usuario usr = (Usuario) jdbcTemplate.queryForObject(query, params, new UsuarioMapper());
					//
					return usr;

				} catch (EmptyResultDataAccessException e) {
					throw new EmptyResultException();
				} catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}
	}

	@Override
	public Usuario findUsuarioByFullname(String fullname) throws DAOException, EmptyResultException {
		
				String query = "SELECT id, nombre, dni, email, password FROM comerciante WHERE nombre = ?";

				Object[] params = new Object[] { fullname };

				try {

					Usuario usr = (Usuario) jdbcTemplate.queryForObject(query, params, new UsuarioMapper());
					//
					return usr;

				} catch (EmptyResultDataAccessException e) {
					throw new EmptyResultException();
				} catch (Exception e) {
					logger.info("Error: " + e.getMessage());
					throw new DAOException(e.getMessage());
				}
				
	}

	@Override
	public Usuario validate(String email, String password) throws LoginException, DAOException {
		
		String query = "SELECT id, nombre, dni, email, password FROM comerciante WHERE email = ? AND password = ?";

		Object[] params = new Object[] { email, password };

		try {

			Usuario usr = (Usuario) jdbcTemplate.queryForObject(query, params, new UsuarioMapper());
			//
			return usr;
			//return null;

		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

}

