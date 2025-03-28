package com.casino.entradaysalida;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/entradaSalida")
public class EntradaSalidaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Instanciamos EntradaWeb y SalidaWeb pasando la petición y respuesta
        EntradaWeb entrada = new EntradaWeb(request);
        SalidaWeb salida = new SalidaWeb(response);

        // Recibimos los datos (por ejemplo, el parámetro "texto")
        entrada.recibirDatos();
        String texto = entrada.darDatos();

        // Construimos el mensaje de salida si se ingresó algo
        String mensajeSalida = "";
        if (texto != null && !texto.trim().isEmpty()) {
            mensajeSalida = "<p>Texto ingresado: <strong>" + texto + "</strong></p>";
        }

        // Construimos la página HTML
        String pagina = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<title>Entrada y Salida en una Página</title>"
                + "</head>"
                + "<body>"
                + "<h1>Ingrese su texto</h1>"
                + "<form action='entradaSalida' method='get'>"
                + "  <input type='text' name='texto' size='50' placeholder='Escribe algo...'>"
                + "  <input type='submit' value='Enviar'>"
                + "</form>"
                + "<div style='margin-top:20px;'>"
                + mensajeSalida
                + "</div>"
                + "</body>"
                + "</html>";

        // Enviamos la respuesta al cliente
        salida.write(pagina);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
