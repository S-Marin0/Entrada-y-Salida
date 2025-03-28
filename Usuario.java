package com.casino.entradaysalida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class Usuario {
    
    private FabricaEntradaYSalida fabrica;
    private Entrada entradaCreada;
    private Salida salidaCreada;

    public Usuario(FabricaEntradaYSalida fabrica) {
        this.fabrica = fabrica;
    }

    public FabricaEntradaYSalida getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabricaEntradaYSalida fabrica) {
        this.fabrica = fabrica;
    }
    
    public void ingresar(){
        entradaCreada = fabrica.crearEntrada();
        entradaCreada.recibirDatos();
        salidaCreada = fabrica.crearSalida(entradaCreada.darDatos());
        salidaCreada.mostrarInformacion(entradaCreada.darDatos());
    }
    
    
}
