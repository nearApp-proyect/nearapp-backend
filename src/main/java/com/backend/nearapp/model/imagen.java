package com.backend.nearapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="imagen")
public class Imagen {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String imagen;
	@ManyToOne
    @JoinColumn(name = "publicacion", nullable = false, updatable = false)
	private Publicacion publicacion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Publicacion getIdPublicacion() {
		return publicacion;
	}
	public void setIdPublicacion(Publicacion idPublicacion) {
		this.publicacion = idPublicacion;
	}
}
