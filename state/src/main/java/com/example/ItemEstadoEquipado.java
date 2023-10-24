package com.example;

public class ItemEstadoEquipado extends ItemEstado{

    private ItemEstadoEquipado(){};
    private static ItemEstadoEquipado instance = new ItemEstadoEquipado();
    public static ItemEstadoEquipado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Equipado";
    }


    public boolean jogarNoChao(Item item){
        item.setEstado(ItemEstadoNoChao.getInstance());
        return true;
    }

    public boolean colocarInventario (Item item){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        return true;
    }

    public boolean quebrar(Item item){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        return true;
    }
    
}
