package com.backend.nearapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Producto;
import com.backend.nearapp.persistence.repo.ProductoRepo;
import com.backend.nearapp.services.NearAppServicesException;
import com.backend.nearapp.services.ProductoServices;

@Service
public class ProductoServicesImpl implements ProductoServices {
	
	@Autowired
	ProductoRepo productoRepo;

	@Override
	public List<Producto> getProductobyCategoria(int categoria)
			throws NearAppServicesException {
		try{
			return productoRepo.getProductoByCategoria(categoria);
		}catch(Exception e){
			throw new NearAppServicesException(e.getMessage(),e);
		}
	}

	
	
}
