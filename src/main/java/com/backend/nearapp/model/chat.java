package com.backend.nearapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chat")

public class Chat {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idChat;
	private String usuarioReceptor;	
	private String usuarioEmisor;
	
	public int getIdChat() {
		return idChat;
	}
	public void setIdChat(int idChat) {
		this.idChat = idChat;
	}
	public String getUsuarioReceptor() {
		return usuarioReceptor;
	}
	public void setUsuarioReceptor(String usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}
	public String getUsuarioEmisor() {
		return usuarioEmisor;
	}
	public void setUsuarioEmisor(String usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}
	
	
}
