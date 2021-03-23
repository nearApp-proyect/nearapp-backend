package com.backend.nearapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoPublicacion")

public class TipoPublicacion {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idTipoPublicacion;
	private String tipo;
	private int comision;
	
	public int getIdTipoPublicacion() {
		return idTipoPublicacion;
	}
	public void setIdTipoPublicacion(int idTipoPublicacion) {
		this.idTipoPublicacion = idTipoPublicacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}	
}
