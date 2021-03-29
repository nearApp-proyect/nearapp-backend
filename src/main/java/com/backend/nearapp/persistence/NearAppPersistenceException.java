package com.backend.nearapp.persistence;

public class NearAppPersistenceException extends Exception{

    public NearAppPersistenceException(String message) {super(message);}

    public NearAppPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}