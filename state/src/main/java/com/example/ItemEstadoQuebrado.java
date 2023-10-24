package com.example;

public class ItemEstadoQuebrado extends ItemEstado {

    private ItemEstadoQuebrado(){};
    private static ItemEstadoQuebrado instance = new ItemEstadoQuebrado();
    public static ItemEstadoQuebrado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Quebrado";
    }
    
}
