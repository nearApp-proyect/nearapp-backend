package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{


}