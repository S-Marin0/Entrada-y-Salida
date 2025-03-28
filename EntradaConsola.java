package com.casino.entradaysalida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class EntradaConsola extends Entrada {

    @Override
    public void recibirDatos() {
        System.out.println("Ingrese la entrada: ");
        Scanner lector = new Scanner(System.in);
        this.información = lector.nextLine();
        lector.close();
    }

    @Override 
    public String darDatos() {
        return información;
    }

}
