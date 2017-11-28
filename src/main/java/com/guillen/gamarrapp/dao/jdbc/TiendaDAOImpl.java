package com.guillen.gamarrapp.dao.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.guillen.gamarrapp.dao.TiendaDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.mapper.TiendaMapper;
import com.guillen.gamarrapp.mapper.UsuarioMapper;
import com.guillen.gamarrapp.model.Tienda;
import com.guillen.gamarrapp.model.Usuario;

@Repository
public class TiendaDAOImpl implements TiendaDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(TiendaDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Tienda findTienda(int id) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM tienda WHERE id = ?";

		Object[] params = new Object[] { id };

		try {

			Tienda tda = (Tienda) jdbcTemplate.queryForObject(query, params, new TiendaMapper());
			return tda;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto, int idComerciante)
			throws DAOException {
		String query = "INSERT INTO tienda (nombre, telefono, latitud, longitud, ubicacion, puesto, comerciante_id)  VALUES ( ?,?,?,?,?,?,? )";

		Object[] params = new Object[] { nombre, telefono, latitud, longitud, ubicacion, puesto, idComerciante};
		
		try {
			// create
			jdbcTemplate.update(query, params);

		} catch (Exception e) {
			logger.error("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void delete(int id) throws DAOException {
		String query = "DELETE FROM tienda WHERE id = ?";
		
		Object[] params = new Object[] { id };
		
		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(int id, String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto, int idComerciante)
			throws DAOException {
		
		String query = "UPDATE tienda SET nombre = ?, telefono =?, latitud = ?, longitud = ?, ubicacion = ?, puesto = ?, comerciante_id = ? WHERE id = ?";

		Object[] params = new Object[] { nombre, telefono, latitud, longitud, ubicacion, puesto, idComerciante, id};

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public List<Tienda> findAllTiendas() throws DAOException, EmptyResultException {
		String query = "SELECT * FROM tienda";
		
		try {

			List<Tienda> tiendas = jdbcTemplate.query(query, new TiendaMapper());
			//
			return tiendas;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Tienda> findTiendasByName(String nombre) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM tienda WHERE nombre = ? ";

		Object[] params = new Object[] { nombre };

		try {
			//DOUBTS AT USING QUERY OR QUERYFOROBJECT
			List<Tienda> tiendas = jdbcTemplate.query(query, params, new TiendaMapper());
			return tiendas;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	@Override
	public Tienda findTiendaByName(String name) throws DAOException, EmptyResultException {
		String query = "SELECT * FROM tienda WHERE nombre = ?";

		Object[] params = new Object[] { name };

		try {

			Tienda tda = (Tienda) jdbcTemplate.queryForObject(query, params, new TiendaMapper());
			return tda;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Tienda> findTiendasByCategoria(String categoria) throws DAOException, EmptyResultException {
		//FOREIGN KEY TO TABLE TIENDA HAS CAEGORIA
		//ACA TE QUEDASTE WEmp
//		String query = "SELECT * FROM tienda WHERE name_student = 'Bobby Tables',\n" + 
//				"       id_teacher_fk = (\n" + 
//				"       SELECT id_teacher\n" + 
//				"         FROM tab_teacher\n" + 
//				"        WHERE name_teacher = 'Dr. Smith')";
		return null;
	}

	@Override
	public void addCategoria(String tienda, String categoria) throws DAOException{
		/*FOREIGN KEY TO TABLE TIENDA HAS CATEGORIA
		String query = "SELECT * FROM tienda"*/
	}

		

}
