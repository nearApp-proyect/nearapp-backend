package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.*;

public interface CategoriaServices {
	
	List<Categoria> getCategorias()throws NearAppServicesException;
}
