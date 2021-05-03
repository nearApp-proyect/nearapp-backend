package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.Usuario;
import com.backend.nearapp.services.NearAppServicesException;
public interface UsuarioServices {
	
	//USUARIOS

    /**
     * Registra un usuario en la DB
     *
     * @param user Usuario que se ingresa
     * @return 
     * @throws NearAppServicesException
     */
    Usuario addUser(Usuario user) throws NearAppServicesException;


    /**
     * Retorna todos los usuarios registrados
     *
     * @return Lista de usuarios registrados en la DB
     * @throws NearAppServicesException
     */
    List<Usuario> getAllUsers() throws NearAppServicesException;
    
    
    /**
     * Retorna un usuario por nickname
     *
     * @param nickname nickname del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppServicesException
     */
    Usuario getUserByNickname(String nickname) throws NearAppServicesException;

    /**
     * Modifica o actualiza datos de un usuario en la DB
     *
     * @param id Id del usuario a modificar
     * @param user Nuevo objeto usuario actualizado
     * @return 
     * @throws NearAppServicesException
     */
	Usuario modifyUser(Usuario user) throws NearAppServicesException; 
	
	
	Usuario Login(String nickname, String password) throws NearAppServicesException;

}
