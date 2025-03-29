package com.casino.entradaysalida;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FabricaWeb {

    public EntradaWeb crearEntrada(HttpServletRequest request) {
        return new EntradaWeb(request);
    }

    public SalidaWeb crearSalida(HttpServletResponse response) {
        return new SalidaWeb(response);
    }
}
