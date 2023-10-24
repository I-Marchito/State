package com.example;

public class ItemEstadoDesaparecido extends ItemEstado{

    private ItemEstadoDesaparecido(){};
    private static ItemEstadoDesaparecido instance = new ItemEstadoDesaparecido();
    public static ItemEstadoDesaparecido getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Desapareceu";
    }
    
}
