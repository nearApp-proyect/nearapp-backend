package com.backend.nearapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PublicacionGusto")
public class PublicacionGusto {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	@ManyToOne
    @JoinColumn(name = "usuario", nullable = false, updatable = false)
	private Usuario usuario;
	@ManyToOne
    @JoinColumn(name = "publicacion", nullable = false, updatable = false)
	private Publicacion publicacion;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Publicacion getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	
	
}
