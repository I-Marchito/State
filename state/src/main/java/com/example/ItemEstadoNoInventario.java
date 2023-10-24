package com.example;

public class ItemEstadoNoInventario extends ItemEstado{

    private ItemEstadoNoInventario(){};
    private static ItemEstadoNoInventario instance = new ItemEstadoNoInventario();
    public static ItemEstadoNoInventario getInstance() {
        return instance;
    }

    public String getEstado(){
        return "No Inventário";
    }

    public boolean equipar (Item item){
        item.setEstado(ItemEstadoEquipado.getInstance());
        return true;
    }

    public boolean reciclar (Item item){
        item.setEstado(ItemEstadoReciclado.getInstance());
        return true;
    }

    public boolean jogarNoChao(Item item){
        item.setEstado(ItemEstadoNoChao.getInstance());
        return true;
    }
    
}
