package com.backend.nearapp.persistence;

import com.backend.nearapp.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NearAppPersistence {

    //USUARIOS

    /**
     * Registra un usuario en la DB
     *
     * @param user Usuario que se ingresa
     * @throws NearAppPersistenceException
     */
    void addUser(Usuario user) throws NearAppPersistenceException;


    /**
     * Retorna todos los usuarios registrados
     *
     * @return Lista de usuarios registrados en la DB
     * @throws NearAppPersistenceException
     */
    List<Usuario> getAllUsers() throws NearAppPersistenceException;
    
    /**
     * Retorna un usuario por id
     *
     * @param id Id del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppPersistenceException
     */
    Usuario getUserById(int id) throws NearAppPersistenceException;

    /**
     * Retorna un usuario por nickname
     *
     * @param nickname nickname del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppPersistenceException
     */
    Usuario getUserByNickname(String nickname) throws NearAppPersistenceException;

    /**
     * Modifica o actualiza datos de un usuario en la DB
     *
     * @param id Id del usuario a modificar
     * @param user Nuevo objeto usuario actualizado
     * @throws NearAppPersistenceException
     */
    void modifyUser(Usuario user, int id) throws NearAppPersistenceException;

    //PRODUCTOS

    /**
     * Registra un producto en la DB
     *
     * @param product Producto que se ingresa
     * @throws NearAppPersistenceException
     */
    void addProduct(Producto product) throws NearAppPersistenceException;

    /**
     * Retorna todos los productos registrados
     *
     * @return Lista de productos registrados en la DB
     * @throws NearAppPersistenceException
     */
    List<Producto> getAllProducts() throws NearAppPersistenceException;

    /**
     * Retorna un producto por id
     *
     * @param id Id del producto a buscar
     * @return Producto especificado por id
     * @throws NearAppPersistenceException
     */

    Producto getProductById(int id) throws NearAppPersistenceException;


    /**
     * Retorna el producto asociado a una publicación
     *
     * @param publicacionId Id de la publicación
     * @return Producto asociado a la publicación específicada
     * @throws NearAppPersistenceException
     */

    Producto getProductByPublicationId(int publicacionId) throws NearAppPersistenceException;


    //CATEGORIAS

    /**
     * Registra una categoría en la DB
     *
     * @param categoria que se ingresa
     * @throws NearAppPersistenceException
     */
    void addCategoria(Categoria categoria) throws NearAppPersistenceException;

    /**
     * Retorna todos las categorías registradas
     *
     * @return Lista de categorías registradas en la DB
     * @throws NearAppPersistenceException
     */
    List<Categoria> getAllCategorias() throws NearAppPersistenceException;

    /**
     * Retorna una categoría por id
     *
     * @param id Id de la categoría a buscar
     * @return Categoría especificada por id
     * @throws NearAppPersistenceException
     */
    Categoria getCategoriaById(int id) throws NearAppPersistenceException;

    //PUBLICACIONES

    /**
     * Registra una publicacion en la DB
     *
     * @param product Publicación que se ingresa
     * @throws NearAppPersistenceException
     */
    void addPublicacion(Publicacion publicacion) throws NearAppPersistenceException;

    /**
     * Retorna todos las publicaciones registrados
     *
     * @return Lista de publicaciones registradas en la DB
     * @throws NearAppPersistenceException
     */
    List<Publicacion> getAllPublicaciones() throws NearAppPersistenceException;

    /**
     * Retorna una publicación por id
     *
     * @param id Id de la publicación a buscar
     * @return Publicación especificada por id
     * @throws NearAppPersistenceException
     */

    Publicacion getPublicacionById(int id) throws NearAppPersistenceException;


    /**
     * Retorna todos las publicaciones de un usuario específico
     *
     * @param userId Id del usuario
     * @return Lista de publicaciones registradas por un usuario
     * @throws NearAppPersistenceException
     */
    List<Publicacion> getPublicacionesOfAnUser(int userId) throws NearAppPersistenceException;

    /**
     * Retorna todos las publicaciones de una categoria específica
     *
     * @param categoriaId Id de la categoria
     * @return Lista de publicaciones registradas en una categoría específica
     * @throws NearAppPersistenceException
     */
    List<Publicacion> getPublicacionesByCategoria(int categoriaId) throws NearAppPersistenceException;  

    /**
     * Modifica o actualiza datos de una publicación en la DB
     *
     * @param id Id de la publicación a modificar
     * @param publicacion Nuevo objeto publicación actualizado
     * @throws NearAppPersistenceException
     */
    void modifyPublicacion(Publicacion publicacion, int id) throws NearAppPersistenceException;

    /**
     * Elimina una publicación en la DB
     *
     * @param publicacion Id de la publicación a eliminar 
     * @param producto Id del objeto asociado a la publicación a eliminar     
     * @throws NearAppPersistenceException
     */
    void deletePublicacion(int publicacion, int producto) throws NearAppPersistenceException;
}