package com.backend.nearapp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mensaje")

public class Mensaje {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idMensaje;
	private int chat;
	private String descripcion;
	private Date fecha;
	private String userReceptor;
	private String userEmisor;
	
	public int getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}
	public int getChat() {
		return chat;
	}
	public void setChat(int chat) {
		this.chat = chat;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUserReceptor() {
		return userReceptor;
	}
	public void setUserReceptor(String userReceptor) {
		this.userReceptor = userReceptor;
	}
	public String getUserEmisor() {
		return userEmisor;
	}
	public void setUserEmisor(String userEmisor) {
		this.userEmisor = userEmisor;
	}
	
	
}
