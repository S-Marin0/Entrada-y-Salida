package com.casino.entradaysalida;

public class Usuario {

    private Entrada entrada;
    private Salida salida;

    public Usuario(FabricaEntradaYSalida fabrica) {
        this.entrada = fabrica.crearEntrada();
        this.salida = fabrica.crearSalida("Bienvenido");
    }

    public void ingresar() {
        entrada.recibirDatos();
        // Si la entrada es de consola, asumimos que es una instancia de EntradaConsola.
        if (entrada instanceof EntradaConsola) {
            double valor = ((EntradaConsola) entrada).darDouble();
            salida.mostrarInformacion("El valor ingresado es: " + valor);
        } else {
            // Manejo para otros tipos de entrada...
            salida.mostrarInformacion("El numero es " + entrada.darDatos());
        }
    }
}
