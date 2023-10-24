package com.example;

public class ItemEstadoReciclado extends ItemEstado {

    private ItemEstadoReciclado(){};
    private static ItemEstadoReciclado instance = new ItemEstadoReciclado();
    public static ItemEstadoReciclado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Reciclado";
    }
    
}
