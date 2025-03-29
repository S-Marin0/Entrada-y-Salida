package com.casino.entradaysalida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class FabricaFrame extends FabricaEntradaYSalida {

    @Override
    public Entrada crearEntrada() {
        return new EntradaFrame();
    }

    @Override
    public Salida crearSalida(String info) {
        return new SalidaFrame();
    }



}
