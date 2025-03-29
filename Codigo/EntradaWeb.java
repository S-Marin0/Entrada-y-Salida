package com.casino.entradaysalida;

import jakarta.servlet.http.HttpServletRequest;

public class EntradaWeb extends Entrada {
    private HttpServletRequest request;

    public EntradaWeb(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void recibirDatos() {
        // Obtén un parámetro, por ejemplo "texto"
        this.información = request.getParameter("texto");
    }

    @Override
    public String darDatos() {
        return this.información;
    }
    
    /**
     * Nuevo método para convertir la información a double utilizando el adapter.
     * @return El valor double obtenido de la entrada o 0 en caso de error.
     */
    public double darDouble() {
        return AdapterEntrada.convertirDouble(información, "web");
    }
}
