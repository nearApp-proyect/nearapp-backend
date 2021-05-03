package com.backend.nearapp.persistence.repo;

import javax.transaction.Transactional;

import com.backend.nearapp.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String>{

	@Query(value="select u.nickname,u.apellido,u.celular,u.ciudad,u.direccion,u.documento,u.nombre,u.tdocumento,u.password,u.correo,u.foto from Usuario u where u.nickname= ?1",nativeQuery = true)
	Usuario getUserByNickname(String nickname);
	
	@Query(value="select u.nickname,u.apellido,u.celular,u.ciudad,u.direccion,u.documento,u.nombre,u.tdocumento,u.password,u.correo,u.foto from Usuario u where u.nickname= ?1 and u.password= ?2",nativeQuery = true)
	Usuario Login(String nickname,String password);
	
	@Transactional
    @Modifying
    @Query("update Usuario u set u.apellido = ?1,u.celular=?2,u.ciudad=?3,u.direccion=?4,u.nombre=?5, u.password=?7, u.correo=?8 where u.nickname =?6")
	void setUsuario(String apellido,String celular,String ciudad,String direccion,String nombre,String nickname,String password,String correo);
}