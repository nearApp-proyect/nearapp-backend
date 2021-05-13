package com.backend.nearapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Publicacion;
import com.backend.nearapp.persistence.repo.PublicacionRepo;
import com.backend.nearapp.services.NearAppServicesException;
import com.backend.nearapp.services.PublicacionServices;

@Service
public class PublicacionServicesImpl implements PublicacionServices {

	@Autowired
	PublicacionRepo pubRepo;

	@Override
	public Publicacion savePublication(Publicacion publicacion)
			throws NearAppServicesException {
		try{
			return pubRepo.save(publicacion);
		}catch(Exception ex){
			throw new NearAppServicesException(ex.getMessage(), ex);
		}
	}

	@Override
	public List<Publicacion> getAllPublicacionUser(String nickname)
			throws NearAppServicesException {
		try{
			return pubRepo.getAllUser(nickname);
		}catch(Exception ex){
			throw new NearAppServicesException(ex.getMessage(), ex);
		}
	}

	@Override
	public List<Publicacion> getAllPublicacionCateg(int categoria)
			throws NearAppServicesException {
				
		try{
			return pubRepo.getAllCategoria(categoria);
		}catch(Exception ex){
			throw new NearAppServicesException(ex.getMessage(), ex);
		}
	}
}

