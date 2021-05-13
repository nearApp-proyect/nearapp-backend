package com.backend.nearapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Imagen;
import com.backend.nearapp.persistence.repo.ImagenRepo;
import com.backend.nearapp.services.ImagenServices;
import com.backend.nearapp.services.NearAppServicesException;

@Service
public class ImagenServicesImpl implements ImagenServices {
	
	@Autowired
	ImagenRepo imgRepo;

	@Override
	public Imagen saveImagen(Imagen imagen) throws NearAppServicesException {
				
		try{
			return imgRepo.save(imagen);
		}catch(Exception e){
			throw new NearAppServicesException(e.getMessage(),e);
		}
	}

	@Override
	public List<Imagen> getImagenByPub(int publicacion)
			throws NearAppServicesException {
		try{
			return imgRepo.getImagenPub(publicacion);
		}catch(Exception e){
			throw new NearAppServicesException(e.getMessage(),e);
		}
	}

}
