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
@Table(name="Producto")
public class Producto {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String nombre;
	@ManyToOne
    @JoinColumn(name = "categoria", nullable = false, updatable = false)
	private Categoria categoria;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProducto")
	private List<Publicacion> publicacion; 
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public List<Publicacion> getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(List<Publicacion> publicacion) {
		this.publicacion = publicacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
