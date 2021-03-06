package com.backend.nearapp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Usuario;
import com.backend.nearapp.persistence.repo.UsuarioRepo;
import com.backend.nearapp.services.NearAppServicesException;
import com.backend.nearapp.services.UsuarioServices;

@Service
public class UsuarioServiceImpl implements UsuarioServices {

	@Autowired
	UsuarioRepo userRepo;
	
	@Override
	public Usuario addUser(Usuario user) throws NearAppServicesException {
		
		try {
            userRepo.save(user);
            return user;
        } catch (Exception ex) {
            throw new NearAppServicesException(ex.getMessage(), ex);
        }
	}

	@Override
	public List<Usuario> getAllUsers() throws NearAppServicesException {
		try {
            return userRepo.findAll();
        } catch (Exception ex) {
            throw new NearAppServicesException(ex.getMessage(), ex);
        }
	}
	
	@Override
	public Usuario getUserByNickname(String nickname) throws NearAppServicesException {
		try {
            return userRepo.getUserByNickname(nickname); 
        } catch (Exception e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
	}

	@Override
	public Usuario modifyUser(Usuario user) throws NearAppServicesException{
		try {
			userRepo.setUsuario(user.getApellido(), user.getCelular(), user.getCiudad(), user.getDireccion(), user.getNombre(),user.getNickname(), user.getPassword(), user.getCorreo());
			return user;
        } catch (Exception e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
	}

	@Override
	public Usuario Login(String nickname, String password)throws NearAppServicesException{
		try{
			return userRepo.Login(nickname, password);			
		}catch(Exception e){
			throw new NearAppServicesException(e.getMessage(), e);
		}
	}

}
