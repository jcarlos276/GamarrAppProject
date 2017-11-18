package com.guillen.gamarrapp.model;

public class Tienda {
	public int id;
	public String nombre;
	public int telefono;
	public String latitud;
	public String altitud;
	public String direccion;
	public int idComerciante;
	
	public Tienda() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getAltitud() {
		return altitud;
	}
	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdComerciante() {
		return idComerciante;
	}
	public void setIdComerciante(int idComerciante) {
		this.idComerciante = idComerciante;
	}
}
