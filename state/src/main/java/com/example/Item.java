package com.example;

public class Item {
    
    private String nome;
    private ItemEstado estado;

    public Item(){
        this.estado = ItemEstadoNoChao.getInstance();
    }

    public void setEstado(ItemEstado estado){
        this.estado = estado;
    }

    public boolean colocarInventario(){
        return estado.colocarInventario(this);
    }

    public boolean equipar(){
        return estado.equipar(this);
    }

    public boolean reciclar(){
        return estado.reciclar(this);
    }

    public boolean quebrar(){
        return estado.quebrar(this);
    }

    public boolean jogarNoChao(){
        return estado.jogarNoChao(this);
    }

    public boolean desaparecer (){
        return estado.desaparecer(this);
    }

    public String getNomeEstado(){
        return estado.getEstado();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ItemEstado getEstado(){
        return estado;
    }


    
}