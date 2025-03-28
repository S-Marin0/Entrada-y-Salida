package com.casino.entradaysalida;

import java.io.IOException;
import jakarta.servlet.http.HttpServletResponse;

public class SalidaWeb extends Salida {
    private HttpServletResponse response;

    public SalidaWeb(HttpServletResponse response) {
        this.response = response;
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    public void mostrarInformacion(String info) {
        try {
            response.getWriter().write("<html><body>" + info + "</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método auxiliar si lo necesitas:
    public void write(String contenido) throws IOException {
        response.getWriter().write(contenido);
    }
}
