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
@Table(name="Chat")
public class Chat {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String usuarioreceptor;
	private String usuarioemisor;
	
	public int getIdChat() {
		return id;
	}
	public void setIdChat(int idChat) {
		this.id = idChat;
	}
	public String getUsuarioReceptor() {
		return usuarioreceptor;
	}
	public void setUsuarioReceptor(String usuarioReceptor) {
		this.usuarioreceptor = usuarioReceptor;
	}
	public String getUsuarioEmisor() {
		return usuarioemisor;
	}
	public void setUsuarioEmisor(String usuarioEmisor) {
		this.usuarioemisor = usuarioEmisor;
	}
}
