package com.backend.nearapp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.nearapp.model.Subscripcion;
import com.backend.nearapp.persistence.repo.SubscripcionRepo;
import com.backend.nearapp.services.NearAppServicesException;
import com.backend.nearapp.services.SubscripcionServices;

@Service
public class SubscripcionServicesImpl implements SubscripcionServices {

    @Autowired
	SubscripcionRepo subscripcionRepo;

    @Override
	public Subscripcion getSubscriptionByNickname(String nickname) throws NearAppServicesException {
		try {
            return subscripcionRepo.getSubscriptionByNickname(nickname); 
        } catch (Exception e) {
            throw new NearAppServicesException(e.getMessage(), e);
        }
	}

}