package com.artisan.gallery_backend.dto;

// The fix is here: Replaced Lombok annotations with explicit constructors and getters/setters.
public class AuthResponse {
    private String token;

    public AuthResponse() {
    }

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
