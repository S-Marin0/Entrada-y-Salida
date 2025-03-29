package com.casino.entradaysalida;

import jakarta.servlet.Servlet;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class EjercicioMediosEntradaYSalida {

    public static void main(String[] args) throws Exception {
        int opciones = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Bienvenido. ¿Cómo desea llevar a cabo el proceso de entrada y salida?\n" +
            "\n1. Por consola\n2. Por interfaz gráfica\n3. Por web\n4. Cerrar\n"));

        switch (opciones) {
            case 1 -> {
                Usuario usuario1 = new Usuario(new FabricaConsola());
                usuario1.ingresar();
            }
            case 2 -> {
                Usuario usuario1 = new Usuario(new FabricaFrame());
                usuario1.ingresar();
            }
            case 3 -> {
                iniciarServidorWeb();
            }
            case 4 -> {
                System.exit(0);
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    private static void iniciarServidorWeb() throws Exception {
        // Configuramos el servidor en el puerto 8080.
        Server server = new Server(8081);

        // Creamos el contexto para los servlets.
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Registramos el servlet que gestiona la entrada y salida web.
        ServletHolder servletHolder = new ServletHolder((Servlet) new EntradaSalidaServlet());
        context.addServlet(servletHolder, "/entradaSalida");

        // Iniciamos el servidor.
        server.start();
        System.out.println("Servidor iniciado en http://localhost:8080/entradaSalida");

        // Intentamos abrir el navegador con la URL
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("http://localhost:8080/entradaSalida"));
            } catch (Exception e) {
                System.err.println("No se pudo abrir el navegador: " + e.getMessage());
            }
        } else {
            System.out.println("No se soporta la apertura automática del navegador.");
        }

        // Mantenemos el servidor activo.
        server.join();
    }
}
