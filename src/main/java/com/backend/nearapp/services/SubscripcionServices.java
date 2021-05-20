package com.backend.nearapp.services;

import java.util.List;

import com.backend.nearapp.model.Subscripcion;
import com.backend.nearapp.services.NearAppServicesException;

public interface SubscripcionServices {
    
     /**
     * Retorna la subscripcion por nickname (usuario)
     *
     * @param nickname nickname del usuario a buscar
     * @return Usuario especificado por id
     * @throws NearAppServicesException
     */
    Subscripcion getSubscriptionByNickname(String nickname) throws NearAppServicesException;

    
}
