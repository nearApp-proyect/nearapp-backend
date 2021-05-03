package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.*;

public interface ProductoServices {

	List<Producto> getProductobyCategoria(int categoria) throws NearAppServicesException;
}
