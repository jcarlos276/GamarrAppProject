package com.guillen.gamarrapp.servicios;

import java.util.List;

import com.guillen.gamarrapp.exception.DAOException;
import com.guillen.gamarrapp.exception.EmptyResultException;
import com.guillen.gamarrapp.model.Tienda;


public interface TiendaService {
	
	List<Tienda> findAllTiendas() throws DAOException, EmptyResultException;
	
	Tienda findTienda(int id) throws DAOException, EmptyResultException;

	void create(String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto, int idComerciante) throws DAOException;

	void delete(int id) throws DAOException;

	void update(int id, String nombre, int telefono, String latitud, String longitud, String ubicacion, String puesto, int idComerciante) throws DAOException;

	List<Tienda> findTiendasByName(String nombre) throws DAOException, EmptyResultException;

	List<Tienda> findTiendasByCategoria(String categoria) throws DAOException, EmptyResultException;
	
}
