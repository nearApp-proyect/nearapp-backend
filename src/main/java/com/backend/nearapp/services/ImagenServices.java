package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.Imagen;

public interface ImagenServices {
	
	Imagen saveImagen(Imagen imagen) throws NearAppServicesException;
	
	List<Imagen> getImagenByPub(int publicacion) throws NearAppServicesException;
}
