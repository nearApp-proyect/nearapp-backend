package com.backend.nearapp.persistence.repo;

import com.backend.nearapp.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepo extends JpaRepository<Chat, Integer>{


}