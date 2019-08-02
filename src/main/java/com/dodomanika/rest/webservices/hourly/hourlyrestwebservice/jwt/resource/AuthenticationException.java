package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.jwt.resource;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
