package com.guillen.gamarrapp.model;

public class Tienda {
	public int id;
	public String nombre;
	public int telefono;
	public String latitud;
	public String longitud;
	public String ubicacion;
	public String puesto;
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
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getIdComerciante() {
		return idComerciante;
	}
	public void setIdComerciante(int idComerciante) {
		this.idComerciante = idComerciante;
	}
}
