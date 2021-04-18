package com.backend.nearapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.backend.nearapp.model.*;

@Entity
@Table(name="Usuario")
public class Usuario {
	@Id
	private String nickname;
	private String tdocumento;
	private int documento;
	private String nombre;
	private String apellido;
	private String direccion;
	public String ciudad;
	public String celular;
	public String password;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Publicacion> publicacion;	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Comentario> cometario;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioEmisor")
	private List<Chat> chatEmi;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioReceptor")
	private List<Chat> chatRecep;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<PublicacionGusto> publicacionGustos;

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTdocumento() {
		return tdocumento;
	}
	
	public void setTdocumento(String tdocumento) {
		this.tdocumento = tdocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Publicacion> getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(List<Publicacion> publicacion) {
		this.publicacion = publicacion;
	}
	public List<Comentario> getCometario() {
		return cometario;
	}
	public void setCometario(List<Comentario> cometario) {
		this.cometario = cometario;
	}
	public List<Chat> getChatEmi() {
		return chatEmi;
	}
	public void setChatEmi(List<Chat> chatEmi) {
		this.chatEmi = chatEmi;
	}
	public List<Chat> getChatRecep() {
		return chatRecep;
	}
	public void setChatRecep(List<Chat> chatRecep) {
		this.chatRecep = chatRecep;
	}
}
