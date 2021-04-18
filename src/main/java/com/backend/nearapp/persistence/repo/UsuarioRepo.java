package com.backend.nearapp.persistence.repo;

import javax.transaction.Transactional;

import com.backend.nearapp.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepo extends JpaRepository<Usuario, String>{

	@Query(value="select u.nickname,u.apellido,u.celular,u.ciudad,u.direccion,u.documento,u.nombre,u.tdocumento,u.password from Usuario u where u.nickname= ?1",nativeQuery = true)
	Usuario getUserByNickname(String nickname);
	
	@Transactional
    @Modifying
    @Query("update Usuario u set u.apellido = ?1,u.celular=?2,u.ciudad=?3,u.direccion=?4,u.nombre=?4 where u.nickname =?5")
	void setUsuario(String apellido,String celular,String ciudad,String direccion,String nombre,String nickname);
}