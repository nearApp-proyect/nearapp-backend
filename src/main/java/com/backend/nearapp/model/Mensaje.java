package com.backend.nearapp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mensaje")
public class Mensaje {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String descripcion;
	private Date fecha;
	private String userreceptor;
	private String useremisor;
	private int chat;
	
	public int getIdMensaje() {
		return id;
	}
	public void setIdMensaje(int idMensaje) {
		this.id = idMensaje;
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
		return userreceptor;
	}
	public void setUserReceptor(String userReceptor) {
		this.userreceptor = userReceptor;
	}
	public String getUserEmisor() {
		return useremisor;
	}
	public void setUserEmisor(String userEmisor) {
		this.useremisor = userEmisor;
	}
}
