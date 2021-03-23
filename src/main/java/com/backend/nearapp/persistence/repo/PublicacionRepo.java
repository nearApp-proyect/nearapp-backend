package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionRepo extends JpaRepository<Publicacion, Integer>{


}