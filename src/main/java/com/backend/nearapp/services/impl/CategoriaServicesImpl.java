package com.backend.nearapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Categoria;
import com.backend.nearapp.persistence.repo.CategoriaRepo;
import com.backend.nearapp.services.CategoriaServices;
import com.backend.nearapp.services.NearAppServicesException;

@Service
public class CategoriaServicesImpl implements CategoriaServices {
	
	@Autowired
	CategoriaRepo categoriaRepo;

	@Override
	public List<Categoria> getCategorias() throws NearAppServicesException {
		try{
			return categoriaRepo.findAll();
		}catch(Exception e){
			throw new NearAppServicesException(e.getMessage(),e);
		}
	}
}
