package com.tae.androidclientspring_boot_webflux_security.model;


import com.tae.androidclientspring_boot_webflux_security.model.Moto;

import java.util.List;

public class User {

    private String id;

    private String login;

    private String password;

    private List<Moto> motos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }
}
