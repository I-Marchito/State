package com.example;

public abstract class ItemEstado {

    public abstract String getEstado();

    public boolean colocarInventario (Item item){
        return false;
    }

    public boolean equipar (Item item){
        return false;
    }

    public boolean reciclar (Item item){
        return false;
    }

    public boolean quebrar (Item item){
        return false;
    }

    public boolean jogarNoChao (Item item){
        return false;
    }

    public boolean desaparecer (Item item){
        return false;
    }

}
