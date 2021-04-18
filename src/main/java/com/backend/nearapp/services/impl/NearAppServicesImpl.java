package com.backend.nearapp.services.impl;

import com.backend.nearapp.model.*;
import com.backend.nearapp.persistence.repo.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface NearAppServicesImpl implements NearAppServices {

    @Autowired 
    UsuarioRepo userrepo;
    
    
    
    @Override
    public void addUser(Usuario user) throws NearAppServicesException {
        try {
            nearAppPersistence.addUser(user);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    } 

    @Override
    public List<Usuario> getAllUsers() throws NearAppServicesException {
        try {
            nearAppPersistence.getAllUsers();
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public Usuario getUserById(int id) throws NearAppServicesException {
        try {
            nearAppPersistence.getUserById(id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public Usuario getUserByNickname(String nickname) throws NearAppServicesException {
        try {
            nearAppPersistence.getUserByNickname(nickname);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public void modifyUser(Usuario user, int id) throws NearAppServicesException {
        try {
            nearAppPersistence.modifyUser(user, id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    } 

    @Override
    public void addProduct(Producto product) throws NearAppServicesException {
        try {
            nearAppPersistence.addProduct(product);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    } 

    @Override
    public List<Producto> getAllProducts() throws NearAppServicesException {
        try {
            nearAppPersistence.getAllProducts();
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    } 

    @Override
    public Product getProductById(int id) throws NearAppServicesException {
        try {
            nearAppPersistence.getProductById(id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public Product getProductById(int publicacionId) throws NearAppServicesException {
        try {
            nearAppPersistence.getProductByPublicationId(int publicacionId);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public void addCategoria(Categoria categoria) throws NearAppServicesException {
        try {
            nearAppPersistence.addCategoria(categoria);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public List<Categoria> getAllCategorias() throws NearAppServicesException {
        try {
            nearAppPersistence.getAllCategorias();
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public Categoria getCategoriaById(int id) throws NearAppServicesException {
        try {
            nearAppPersistence.getCategoriaById(id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public void addPublicacion(Publicacion publicacion) throws NearAppServicesException {
        try {
            nearAppPersistence.addPublicacion(publicacion);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public List<Publicacion> getAllPublicaciones() throws NearAppServicesException {
        try {
            nearAppPersistence.getAllPublicaciones();
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public Publicación getPublicacionById(int id) throws NearAppServicesException {
        try {
            nearAppPersistence.getPublicacionById(id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public List<Publicacion> getPublicacionesOfAnUser(int userId) throws NearAppServicesException {
        try {
            nearAppPersistence.getPublicacionesOfAnUser(userId);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public List<Publicacion> getPublicacionesByCategoria(int categoriaId) throws NearAppServicesException {
        try {
            nearAppPersistence.getPublicacionesByCategoria(categoriaId);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public void modifyPublicacion(Publicacion publicacion, int id) throws NearAppServicesException {
        try {
            nearAppPersistence.modifyPublicacion(publicacion, id);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

    @Override
    public void deletePublicacion(int publicacion, int producto) throws NearAppServicesException {
        try {
            nearAppPersistence.deletePublicacion(publicacion, producto);
        } catch (NearAppPersistenceException e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
    }

}