package com.casino.entradaysalida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public abstract class FabricaEntradaYSalida {
    
    public abstract Entrada crearEntrada();
    
    public abstract Salida crearSalida(String info);
    
}
