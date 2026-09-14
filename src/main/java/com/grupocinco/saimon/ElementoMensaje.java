package com.grupocinco.saimon;

import java.io.Serializable;

public class ElementoMensaje implements Serializable {
    private String texto;
    private String user;
    
    public ElementoMensaje( ){
    }

    public ElementoMensaje(String _texto, String _user){
        this.texto = _texto;
        this.user = _user;
    }

    public String getTexto() {
        return texto;
    }

    public String getUser() {
        return user;
    }

    public void setMensaje(String _texto) {
        this.texto = _texto;
    }

    public void setUser(String _user) {
        this.user = _user;
    }
}
