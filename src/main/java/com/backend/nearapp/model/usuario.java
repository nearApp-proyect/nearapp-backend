package com.backend.nearapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="usuario")
public class usuario {
	
	public String nickname;
	public String tdocumento;
	public int documento;
	public String nombre;
	public String apellido;
	public String direccion;
	
}
