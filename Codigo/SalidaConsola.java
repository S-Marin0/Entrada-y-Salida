package com.casino.entradaysalida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class SalidaConsola extends Salida {

    @Override
    public void mostrarInformacion(String info) {
        System.out.println("La salida es:");
        System.out.println(info);
    }

}
