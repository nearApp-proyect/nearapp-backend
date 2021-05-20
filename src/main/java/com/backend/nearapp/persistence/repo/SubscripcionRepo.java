package com.backend.nearapp.persistence.repo;

import javax.transaction.Transactional;

import com.backend.nearapp.model.Subscripcion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscripcionRepo extends JpaRepository<Subscripcion, String> {

    @Query(value="select u.nickname,u.tipo from Subscripcion u where u.nickname= ?1",nativeQuery = true)
	Subscripcion getSubscriptionByNickname(String nickname);
    
}
