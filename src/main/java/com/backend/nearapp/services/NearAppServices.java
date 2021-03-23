package com.backend.nearapp.services;

import com.backend.nearapp.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NearAppServices {

    //USUARIOS

    /**
     * Registra un usuario en la DB
     *
     * @param user Usuario que se ingresa
     * @throws NearAppServicesException
     */
    void addUser(Usuario user) throws NearAppServicesException;


    /**
     * Retorna todos los usuarios registrados
     *
     * @return Lista de usuarios registrados en la DB
     * @throws NearAppServicesException
     */
    List<Usuario> getAllUsers() throws NearAppServicesException;
    
    /**
     * Retorna un usuario por id
     *
     * @param id Id del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppServicesException
     */
    Usuario getUserById(int id) throws NearAppServicesException;

    /**
     * Retorna un usuario por nickname
     *
     * @param nickname nickname del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppServicesException
     */
    Usuario getUserByNickname(String nickname) throws NearAppServicesException;

    /**
     * Modifica o actualiza datos de un usuario en la DB
     *
     * @param id Id del usuario a modificar
     * @param user Nuevo objeto usuario actualizado
     * @throws NearAppServicesException
     */
    void modifyUser(Usuario user, int id) throws NearAppServicesException;

    //PRODUCTOS

    /**
     * Registra un producto en la DB
     *
     * @param product Producto que se ingresa
     * @throws NearAppServicesException
     */
    void addProduct(Producto product) throws NearAppServicesException;

    /**
     * Retorna todos los productos registrados
     *
     * @return Lista de productos registrados en la DB
     * @throws NearAppServicesException
     */
    List<Producto> getAllProducts() throws NearAppServicesException;

    /**
     * Retorna un producto por id
     *
     * @param id Id del producto a buscar
     * @return Producto especificado por id
     * @throws NearAppServicesException
     */
    Product getProductById(int id) throws NearAppServicesException;

    /**
     * Retorna el producto asociado a una publicación
     *
     * @param publicacionId Id de la publicación
     * @return Producto asociado a la publicación específicada
     * @throws NearAppServicesException
     */
    Product getProductById(int publicacionId) throws NearAppServicesException;

    //CATEGORIAS

    /**
     * Registra una categoría en la DB
     *
     * @param categoria que se ingresa
     * @throws NearAppServicesException
     */
    void addCategoria(Categoria categoria) throws NearAppServicesException;

    /**
     * Retorna todos las categorías registradas
     *
     * @return Lista de categorías registradas en la DB
     * @throws NearAppServicesException
     */
    List<Categoria> getAllCategorias() throws NearAppServicesException;

    /**
     * Retorna una categoría por id
     *
     * @param id Id de la categoría a buscar
     * @return Categoría especificada por id
     * @throws NearAppServicesException
     */
    Categoria getCategoriaById(int id) throws NearAppServicesException;

    //PUBLICACIONES

    /**
     * Registra una publicacion en la DB
     *
     * @param product Publicación que se ingresa
     * @throws NearAppServicesException
     */
    void addPublicacion(Publicacion publicacion) throws NearAppServicesException;

    /**
     * Retorna todos las publicaciones registrados
     *
     * @return Lista de publicaciones registradas en la DB
     * @throws NearAppServicesException
     */
    List<Publicacion> getAllPublicaciones() throws NearAppServicesException;

    /**
     * Retorna una publicación por id
     *
     * @param id Id de la publicación a buscar
     * @return Publicación especificada por id
     * @throws NearAppServicesException
     */
    Publicación getPublicacionById(int id) throws NearAppServicesException;

    /**
     * Retorna todos las publicaciones de un usuario específico
     *
     * @param userId Id del usuario
     * @return Lista de publicaciones registradas por un usuario
     * @throws NearAppServicesException
     */
    List<Publicacion> getPublicacionesOfAnUser(int userId) throws NearAppServicesException;

    /**
     * Retorna todos las publicaciones de una categoria específica
     *
     * @param categoriaId Id de la categoria
     * @return Lista de publicaciones registradas en una categoría específica
     * @throws NearAppServicesException
     */
    List<Publicacion> getPublicacionesByCategoria(int categoriaId) throws NearAppServicesException;  

    /**
     * Modifica o actualiza datos de una publicación en la DB
     *
     * @param id Id de la publicación a modificar
     * @param publicacion Nuevo objeto publicación actualizado
     * @throws NearAppServicesException
     */
    void modifyPublicacion(Publicacion publicacion, int id) throws NearAppServicesException;

    /**
     * Elimina una publicación en la DB
     *
     * @param publicacion Id de la publicación a eliminar 
     * @param producto Id del objeto asociado a la publicación a eliminar     
     * @throws NearAppServicesException
     */
    void deletePublicacion(int publicacion, int producto) throws NearAppServicesException;
}
