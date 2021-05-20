package com.backend.nearapp.persistence.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.backend.nearapp.model.Publicacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PublicacionRepo extends JpaRepository<Publicacion, Integer>{

	@Query(value="select p.ciudad,p.description,p.estado,p.descuento,p.hora,p.fecha,p.idpublicacion,p.precio,p.tipoproducto,p.tipopublicacion,p.titulo,p.usuario from publicacion p where p.usuario = ?1",nativeQuery=true)
	List<Publicacion> getAllUser(String nickname);
	
	
	@Query(value="select p.ciudad,p.description,p.estado,p.descuento,p.hora,p.fecha,p.idpublicacion,p.precio,p.tipoproducto,p.tipopublicacion,p.titulo,p.usuario from publicacion p "
			+ "join producto p2 on p.tipoproducto = p2.id "
			+ "join categoria c2 on p2.categoria = c2.id "
			+ "where c2.id = ?1",nativeQuery=true)
	List<Publicacion> getAllCategoria(int categoria);
	
	@Query(value="select p.ciudad,p.description,p.estado,p.descuento,p.hora,p.fecha,p.idpublicacion,p.precio,p.tipoproducto,p.tipopublicacion,p.titulo,p.usuario from publicacion p "
			+ "join tipo_publicacion tp on p.tipopublicacion = tp.id_tipo_publicacion "
			+ "where p.estado = 1 and tp.id_tipo_publicacion = 2",nativeQuery=true)
	List<Publicacion> getAllPublicacionRapida();
	
	@Query(value="select p.ciudad,p.description,p.estado,p.descuento,p.hora,p.fecha,p.idpublicacion,p.precio,p.tipoproducto,p.tipopublicacion,p.titulo,p.usuario from publicacion p "
			+ "join tipo_publicacion tp on p.tipopublicacion = tp.id_tipo_publicacion "
			+ "where p.estado = 1 and tp.id_tipo_publicacion = 1",nativeQuery=true)
	List<Publicacion> getAllPublicacionNormal();
	
	@Transactional
    @Modifying
    @Query("update Publicacion p set p.descuento = ?1 where p.idpublicacion =?2")
	void setPublicacion(int descuento,int id);

}