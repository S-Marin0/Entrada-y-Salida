package com.casino.entradaysalida;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class SalidaFrame extends Salida {

    @Override
    public void mostrarInformacion(String info) {
        JOptionPane.showMessageDialog(null,"La salida es: " + info);
    }

}
