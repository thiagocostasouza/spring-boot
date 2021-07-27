package br.com.trainner.alluraforum.controller.dto;

public class TokenDto {
    private final String token;
    private final String bearer;


    public TokenDto(String token, String bearer) {
        this.token = token;
        this.bearer = bearer;


    }

    public String getToken() {
        return token;
    }

    public String getBearer() {
        return bearer;
    }

}
