package com.backend.nearapp.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.nearapp.model.Imagen;

public interface ImagenRepo extends JpaRepository<Imagen,Integer> {
	
	@Query(value="select i.id, i.imagen, i.publicacion from imagen i where i.publicacion = ?1",nativeQuery=true)
	List<Imagen> getImagenPub(int publicidad);
}
