package com.casino.entradaysalida;

import javax.swing.JOptionPane;

public class EntradaFrame extends Entrada {

    @Override
    public void recibirDatos() {
        this.información = JOptionPane.showInputDialog("Ingrese la entrada: ");
    }

    @Override
    public String darDatos() {
        return información;
    }
    
    /**
     * Nuevo método que utiliza el adapter para convertir la información a double.
     * @return El valor double obtenido de la entrada, o 0 si ocurre un error.
     */
    public double darDouble() {
        return AdapterEntrada.convertirDouble(información, "frame");
    }
}
