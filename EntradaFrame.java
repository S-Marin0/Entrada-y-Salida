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
public class EntradaFrame extends Entrada {

    @Override
    public void recibirDatos() {
        this.información = JOptionPane.showInputDialog("Ingrese la entrada: ");
    }

    @Override
    public String darDatos() {
        return información;
    }
    
}
