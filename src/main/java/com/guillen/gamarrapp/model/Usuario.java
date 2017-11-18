package com.guillen.gamarrapp.model;

public class Usuario {	
	private int usuarioId;
	private String fullname;
	private String dni;
    private String email;
    private String password;
    
    public Usuario() {};    
    
	public Usuario(int usuarioId, String fullname, String dni, String email, String password) {
		super();
		this.usuarioId = usuarioId;
		this.fullname = fullname;
		this.dni = dni;
		this.email = email;
		this.password = password;
	}
	
	public int getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
    
    public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
    
    
    @Override
    public String toString() {
        return "User [usuarioId="+ usuarioId + ", fullname=" + fullname + ", dni=" + dni
                + ", email=" + email + ", password="
                + password + "]";
    }
}
