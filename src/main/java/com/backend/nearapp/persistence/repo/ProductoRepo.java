package com.backend.nearapp.persistence.repo;

import java.util.List;

import com.backend.nearapp.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepo extends JpaRepository<Producto, Integer>{
	
	@Query(value="select p.id,p.nombre,p.categoria from Producto p where p.categoria = ?1",nativeQuery=true)
	List<Producto> getProductoByCategoria(int categoria);

}