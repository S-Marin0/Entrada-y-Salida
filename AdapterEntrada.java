/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casino.entradaysalida;

/**
 *
 * @author Estudiantes
 */
public class AdapterEntrada {

    public double convertirDouble(String dato) {
        try {
            return Double.parseDouble(dato);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir " + e);
            return 0;
        }
    }
}
