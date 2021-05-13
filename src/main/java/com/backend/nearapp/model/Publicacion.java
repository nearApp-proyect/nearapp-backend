package com.backend.nearapp.model;

import java.sql.Date;
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
@Table(name="Publicacion")
public class Publicacion {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idpublicacion;
	private Date fecha;
	private String titulo;
	private String description;
	private int precio;
	private String ciudad;
	private int tipoproducto;
	private int tipopublicacion;
	private String usuario;
	private int estado;
	
	public int getIdpublicacion() {
		return idpublicacion;
	}
	public void setIdpublicacion(int idpublicacion) {
		this.idpublicacion = idpublicacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getTipopublicacion() {
		return tipopublicacion;
	}
	public void setTipopublicacion(int tipopublicacion) {
		this.tipopublicacion = tipopublicacion;
	}
	
	public int getTipoproducto() {
		return tipoproducto;
	}
	public void setTipoproducto(int tipoproducto) {
		this.tipoproducto = tipoproducto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
