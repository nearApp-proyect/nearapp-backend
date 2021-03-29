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
@Table(name="publicacion")
public class Publicacion {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int idPublicacion;
	private Date fecha;
	private String titulo;
	private String description;
	private int precio;
	private String ciudad;
	@ManyToOne
    @JoinColumn(name = "tipoProducto", nullable = false, updatable = false)
	private Producto tipoProducto;
	@ManyToOne
    @JoinColumn(name = "tipoPublicacion", nullable = false, updatable = false)
	private TipoPublicacion tipoPublicacion;
	@ManyToOne
    @JoinColumn(name = "usuario", nullable = false, updatable = false)
	private Usuario usuario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
	private List<Comentario> cometarios; 
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
	private List<Imagen> imagenes; 
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "publicacion")
	private List<PublicacionGusto> publicacionGustos;	
	
	public int getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
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
	public TipoPublicacion getIdTipoPublicacion() {
		return tipoPublicacion;
	}
	public void setIdTipoPublicacion(TipoPublicacion tipoPublicacion) {
		this.tipoPublicacion = tipoPublicacion;
	}
	public Producto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(Producto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Comentario> getCometarios() {
		return cometarios;
	}
	public void setCometarios(List<Comentario> cometarios) {
		this.cometarios = cometarios;
	}
}
