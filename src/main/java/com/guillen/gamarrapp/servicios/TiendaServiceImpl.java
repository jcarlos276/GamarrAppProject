package com.guillen.gamarrapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guillen.gamarrapp.dao.TiendaDAO;
import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.model.Tienda;

@Service
public class TiendaServiceImpl implements TiendaService{
	
	@Autowired
	TiendaDAO tiendaDAO;

	@Override
	public List<Tienda> findAllTiendas() throws DAOException, EmptyResultException {
		List<Tienda> tiendas = tiendaDAO.findAllTiendas();
		return tiendas;
	}

	@Override
	public Tienda findTienda(int id) throws DAOException, EmptyResultException {
		Tienda tda = tiendaDAO.findTienda(id);
		return tda;
	}

	@Override
	public void create(String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto, int idComerciante)
			throws DAOException {
		tiendaDAO.create(nombre, telefono, latitud, longitud, ubicacion, puesto, idComerciante);
	}

	@Override
	public void delete(int id) throws DAOException {
		tiendaDAO.delete(id);
		
	}

	@Override
	public void update(int id, String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto,
			int idComerciante) throws DAOException {
		tiendaDAO.update(id, nombre, telefono, latitud, longitud, ubicacion, puesto, idComerciante);
	}

	@Override
	public List<Tienda> findTiendasByName(String nombre) throws DAOException, EmptyResultException {
		List<Tienda> tiendas = tiendaDAO.findTiendasByName(nombre);
		return tiendas;
	}

	@Override
	public List<Tienda> findTiendasByCategoria(String categoria) throws DAOException, EmptyResultException {
		List<Tienda> tiendas = tiendaDAO.findTiendasByCategoria(categoria);
		return tiendas;
	}

	
}
