package com.backend.nearapp.services;

public class NearAppServicesException extends Exception{

    public NearAppServicesException(String message) {super(message);}

    public NearAppServicesException(String message, Throwable cause) {
        super(message, cause);
    }

}