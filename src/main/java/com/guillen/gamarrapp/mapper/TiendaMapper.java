package com.guillen.gamarrapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.guillen.gamarrapp.model.Tienda;
import com.guillen.gamarrapp.model.Usuario;

public class TiendaMapper implements RowMapper<Tienda>{

	public Tienda mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tienda tda = new Tienda();
		tda.setId(rs.getInt("id"));
		tda.setNombre(rs.getString("nombre"));
		tda.setTelefono(rs.getInt("telefono"));
		tda.setLatitud(rs.getString("latitud"));
		tda.setLongitud(rs.getString("longitud"));
		tda.setUbicacion(rs.getString("ubicacion"));
		tda.setPuesto(rs.getString("puesto"));
		tda.setIdComerciante(rs.getInt("comerciante_id"));
		return tda;
	}
}