package com.example;

public class ItemEstadoNoChao extends ItemEstado {

    private ItemEstadoNoChao(){};
    private static ItemEstadoNoChao instance = new ItemEstadoNoChao();
    public static ItemEstadoNoChao getInstance() {
        return instance;
    }

    public String getEstado(){
        return "No Chão";
    }

     public boolean colocarInventario (Item item){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        return true;
    }

     public boolean desaparecer (Item item){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        return true;
    }

}