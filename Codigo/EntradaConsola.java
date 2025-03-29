package com.casino.entradaysalida;

import java.util.Scanner;

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
    
    public double darDouble() {
        return AdapterEntrada.convertirDouble(información, "consola");
    }
}
