package com.casino.entradaysalida;

import javax.swing.JOptionPane;

public class AdapterEntrada {

    public static double convertirDouble(String dato, String medio) {
        try {
            return Double.parseDouble(dato);
        } catch (NumberFormatException e) {
            String errorMsg = "Error al convertir a double: " + e.getMessage();
            switch (medio.toLowerCase()) {
                case "consola":
                    System.out.println(errorMsg);
                    break;
                case "frame":
                    JOptionPane.showMessageDialog(null, errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case "web":
                    // Aquí se podría registrar el error o lanzar una excepción.
                    System.err.println(errorMsg);
                    break;
                default:
                    System.out.println("Medio no soportado: " + medio);
            }
            return 0;
        }
    }
}
