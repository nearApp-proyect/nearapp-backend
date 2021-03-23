package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria, Integer>{


}