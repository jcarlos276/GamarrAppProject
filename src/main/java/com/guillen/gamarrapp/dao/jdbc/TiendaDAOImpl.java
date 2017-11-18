package com.guillen.gamarrapp.dao.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.guillen.gamarrapp.dao.TiendaDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.model.Tienda;

@Repository
public class TiendaDAOImpl implements TiendaDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(TiendaDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Tienda findTienda(int id) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(String nombre, int telefono, String latitud, String altitud, String direccion, int idComerciante)
			throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String nombre, int telefono, String latitud, String altitud, String direccion, int idComerciante)
			throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tienda> findAllTiendas() throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tienda> findTiendasByName(String nombre) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tienda> findTiendasByCategoria(String categoria) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

		

}
