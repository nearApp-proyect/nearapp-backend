package com.backend.nearapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	private List<Producto> producto;
	
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
 