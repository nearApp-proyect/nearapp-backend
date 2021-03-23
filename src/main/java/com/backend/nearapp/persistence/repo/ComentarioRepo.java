package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepo extends JpaRepository<Comentario, Integer>{


}