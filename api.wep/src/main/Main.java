
package main;

import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        try {
           
            URI url = new URI("https://api.chucknorris.io/jokes/random");

           
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

               
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(url);
                } else {
                    System.out.println("La acción 'BROWSE' no está soportada en tu sistema.");
                }
            } else {
                System.out.println("El sistema no soporta la clase Desktop.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar abrir la URL: " + e.getMessage());
        }
    }
}
