package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.Publicacion;

public interface PublicacionServices {
	
	Publicacion savePublication(Publicacion publicacion) throws NearAppServicesException;
	
	List<Publicacion> getAllPublicacionUser(String nickname) throws NearAppServicesException;
	
	List<Publicacion> getAllPublicacionCateg(int categoria) throws NearAppServicesException;
	
}
