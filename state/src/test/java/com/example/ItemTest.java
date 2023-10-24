package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ItemTest {

    Item item;

    @BeforeEach
    public void setUp(){
        item = new Item();
    }

    // Item No Chão

    @Test
    public void naoDeveJogarItemDoChaoNoChaoDnv(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertFalse(item.jogarNoChao());
    }

    @Test
    public void deveJogarItemDoChaoNoInventário(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertTrue(item.colocarInventario());
        assertEquals(ItemEstadoNoInventario.getInstance(), item.getEstado());
    }

    @Test
    public void deveDesaparecerItemDoChao(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertTrue(item.desaparecer());
        assertEquals(ItemEstadoDesaparecido.getInstance(), item.getEstado());
    }

    @Test
    public void naoDeveQuebrarItemDoChao(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertFalse(item.quebrar());
    }

    @Test
    public void naoDeveEquiparItemDoChao(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertFalse(item.equipar());
    }


    @Test
    public void naoDeveReciclarItemDoChao(){
        item.setEstado(ItemEstadoNoChao.getInstance());
        assertFalse(item.reciclar());
    }

    // Item No Inventário

    @Test
    public void naoDeveJogarItemNoInventarioDnv(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertFalse(item.colocarInventario());
    }

    @Test
    public void deveEquiparItemDoInventario(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertTrue(item.equipar());
        assertEquals(ItemEstadoEquipado.getInstance(), item.getEstado());
    }

    @Test
    public void deveReciclarItemDoInventario(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertTrue(item.reciclar());
        assertEquals(ItemEstadoReciclado.getInstance(), item.getEstado());
    }

    @Test
    public void deveJogarItemDoInventarioNoChao(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertTrue(item.jogarNoChao());
        assertEquals(ItemEstadoNoChao.getInstance(), item.getEstado());
    }

    @Test
    public void naoDeveQuebrarItemDoInventario(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertFalse(item.quebrar());
    }

    @Test
    public void naoDeveDesaparecerItemDoInventario(){
        item.setEstado(ItemEstadoNoInventario.getInstance());
        assertFalse(item.desaparecer());
    }

    // Item Equipado

    @Test
    public void naoDeveEquiparItemDnv(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertFalse(item.equipar());
    }

    @Test
    public void deveJogarItemEquipadoNoChao(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertTrue(item.jogarNoChao());
        assertEquals(ItemEstadoNoChao.getInstance(), item.getEstado());
    }

    @Test
    public void deveColocarItemEquipadoNoInventario(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertTrue(item.colocarInventario());
        assertEquals(ItemEstadoNoInventario.getInstance(), item.getEstado());
    }

    @Test
    public void deveQuebrarItemEquipado(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertTrue(item.quebrar());
        assertEquals(ItemEstadoQuebrado.getInstance(), item.getEstado());
    }

    @Test
    public void naoDeveReciclarItemEquipado(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertFalse(item.reciclar());
    }

    @Test
    public void naoDeveDesaparecerItemEquipado(){
        item.setEstado(ItemEstadoEquipado.getInstance());
        assertFalse(item.desaparecer());
    }

    // Item Reciclado

    @Test
    public void naoDeveReciclarItemDnv(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.reciclar());
    }

    @Test
    public void naoDeveJogarItemRecicladoNoChao(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.jogarNoChao());
    }

    @Test
    public void naoDeveJogarItemRecicladoNoInventario(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.colocarInventario());
    }

    @Test
    public void naoDeveQuebrarItemReciclado(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.quebrar());
    }

    @Test
    public void naoDeveDesaparecerItemReciclado(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.desaparecer());
    }

    @Test
    public void naoDeveEquiparItemRecicaldo(){
        item.setEstado(ItemEstadoReciclado.getInstance());
        assertFalse(item.equipar());
    }

    // Item Quebrado

    @Test
    public void naoDeveQuebrarItemDnv(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.quebrar());
    }

    @Test
    public void naoDeveJogarItemQuebradoNoChao(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.jogarNoChao());
    }

    @Test
    public void naoDeveJogarItemQuebradoNoInventario(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.colocarInventario());
    }

    @Test
    public void naoDeveEquiparItemQuebrado(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.equipar());
    }

    @Test
    public void naoDeveDesaparecerItemQuebrado(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.desaparecer());
    }

    @Test
    public void naoDeveReciclarItemQuebrado(){
        item.setEstado(ItemEstadoQuebrado.getInstance());
        assertFalse(item.reciclar());
    }

    // Item Desaparecido

    @Test
    public void naoDeveDesaparecerItemDnv(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.desaparecer());
    }

    @Test
    public void naoDeveJogarItemDesaparecidoNoChao(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.jogarNoChao());
    }

    @Test
    public void naoDeveJogarItemDesaparecidoNoInventario(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.colocarInventario());
    }

    @Test
    public void naoDeveEquiparItemDesaparecido(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.equipar());
    }

    @Test
    public void naoDeveReciclarItemDesaparecido(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.reciclar());
    }

    @Test
    public void naoDeveQuebrarItemDesaparecido(){
        item.setEstado(ItemEstadoDesaparecido.getInstance());
        assertFalse(item.quebrar());
    }




}
