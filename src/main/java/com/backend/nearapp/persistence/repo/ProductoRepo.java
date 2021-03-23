package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Integer>{


}