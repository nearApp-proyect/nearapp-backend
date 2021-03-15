package com.backend.nearapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="usuario")
<<<<<<< Updated upstream
public class usuario {
=======
public class Usuario {
	@Id
	private String nickname;
	private String tdocumento;
	private int documento;
	private String nombre;
	private String apellido;
	private String direccion;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTdocumento() {
		return tdocumento;
	}
	public void setTdocumento(String tdocumento) {
		this.tdocumento = tdocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String ciudad;
	public String celular;
	public String password;
>>>>>>> Stashed changes
	
	public String nickname;
	public String tdocumento;
	public int documento;
	public String nombre;
	public String apellido;
	public String direccion;
	
}
