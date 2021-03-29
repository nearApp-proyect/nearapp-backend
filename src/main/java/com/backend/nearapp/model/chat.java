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
	@ManyToOne
    @JoinColumn(name = "usuarioReceptor", nullable = false, updatable = false)
	private Usuario usuarioReceptor;
	@ManyToOne
    @JoinColumn(name = "usuarioEmisor", nullable = false, updatable = false)
	private Usuario usuarioEmisor;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "chat")
	private List<Mensaje> chats;
	
	public int getIdChat() {
		return idChat;
	}
	public void setIdChat(int idChat) {
		this.idChat = idChat;
	}
	public Usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}
	public void setUsuarioReceptor(Usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}
	public Usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}
	public void setUsuarioEmisor(Usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}
	
	
}
