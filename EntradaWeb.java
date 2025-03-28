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
}
