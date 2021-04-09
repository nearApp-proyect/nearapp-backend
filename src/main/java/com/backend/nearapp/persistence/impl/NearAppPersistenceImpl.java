package com.backend.nearapp.persistence.impl;

import com.backend.nearapp.model.*;
import com.backend.nearapp.persistence.*;
import com.backend.nearapp.persistence.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class NearAppPersistenceImpl implements NearAppPersistence {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private UsuarioRepo userRepo;

    @Autowired
    private CategoriaRepo categoriaRepo;

    @Autowired
    private ChatRepo chatRepo;

    @Autowired
    private ProductoRepo productoRepo;

    @Autowired
    private PublicacionRepo publicacionRepo;

    @Override
    public void addUser(Usuario user) throws NearAppPersistenceException {
        if (user == null) {
            throw new NearAppPersistenceException("El usuario no puede ser nulo.");
        }
        List<Usuario> usuarios = userRepo.findAll();
        if (usuarios.contains(user)) {
            throw new NearAppPersistenceException("Ese usuario ya existe.");
        }
        userRepo.save(user);
    }

    @Override
    public List<Usuario> getAllUsers() throws NearAppPersistenceException {
        if (userRepo.count() == 0) {
            throw new NearAppPersistenceException("No existen usuarios.");
        }
        return userRepo.findAll();
    }

    @Transactional
    @Override
    public Usuario getUserById(int id) throws NearAppPersistenceException {
        Usuario usuario = null;
        if (userRepo.existsById(id)) {
            usuario = userRepo.findById(id).get();
        }
        if (usuario == null) {
            throw new NearAppPersistenceException("El usuario con ese ID no existe");
        }
        return usuario;
    }

    @Override
    public Usuario getUserByNickname(String nickname) throws NearAppPersistenceException {
        Query query = entityManager.createNativeQuery("select * from usuario where nickname=?", Usuario.class);
        query.setParameter(1, nickname);
        if (query.getResultList().size() == 0) {
            throw new NearAppPersistenceException("El usuario con ese nickname no existe");
        }
        return (Usuario) query.getSingleResult();
    }

    @Override
    public void modifyUser(Usuario user, int id) throws NearAppPersistenceException {
        if (user == null) {
            throw new NearAppPersistenceException("El usuario no puede ser nulo");
        }
        if ((user.getNombre()).equals("")) {
            throw new NearAppPersistenceException("El nombre del usuario no puede estar vacío");
        }
        if ((user.getApellido()).equals("")) {
            throw new NearAppPersistenceException("El apellido del usuario no puede estar vacío");
        }
        if ((user.getDireccion()).equals("")) {
            throw new NearAppPersistenceException("La dirección del usuario no puede estar vacío");
        }
        if ((user.getCiudad()).equals("")) {
            throw new NearAppPersistenceException("La ciudad del usuario no puede estar vacío");
        }
        if ((user.getNickname()).equals("")) {
            throw new NearAppPersistenceException("El nickname del usuario no puede estar vacío");
        }
        if ((user.getDocumento()).equals("")) {
            throw new NearAppPersistenceException("El documento del usuario no puede estar vacío");
        }
        if ((user.getCelular()).equals("")) {
            throw new NearAppPersistenceException("El teléfono del usuario no puede estar vacío");
        }
        Usuario usuario = getUserById(id);        
        usuario.setNombre(user.getNombre());
        usuario.setApellido(user.getApellido());
        usuario.setDireccion(user.getDireccion());
        usuario.setCiudad(user.getCiudad());
        usuario.setNickname(user.getNickname());
        usuario.setDocumento(user.getDocumento());
        usuario.setCelular(user.getCelular());
        usuario.setTdocumento(user.getTdocumento());
        userRepo.save(usuario);
    }


}