package com.guillen.gamarrapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.guillen.gamarrapp.model.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usr = new Usuario();
		usr.setUsuarioId(rs.getInt("id"));
		usr.setFullname(rs.getString("nombre"));
		usr.setDni(rs.getString("dni"));
		usr.setEmail(rs.getString("email"));
		usr.setPassword(rs.getString("password"));
		return usr;
	}
}
