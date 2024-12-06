
package ejerciciomerseria;

import java.util.Scanner;


public class EjercicioMerseria {

  
    public static void main(String[] args) {
    
        int cantidadPaquetes;
        double montoTotal = 0 , diferencia, descuento , totalConDec;

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de paquetes ");
        cantidadPaquetes = teclado.nextInt();

        if (cantidadPaquetes < 10) {
            System.out.println("no se permiten ventas minorista cantidad de paquetes 10");
        } else {
            System.out.println("ingrse el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (cantidadPaquetes >= 10 && cantidadPaquetes <= 15) {
                System.out.println("el costo del emvio es de 10 USD");

                montoTotal = montoTotal + 10;

            } else {
                System.out.println("USTED NO TIENE COSTO DE ENVIO ¡GRACIAS POR SU COMPRA!");
            }
        }
        if (montoTotal < 100) {
            diferencia = 100 - montoTotal;
            System.out.println("el monto es menor a 100 no posees promociones. necesita comprar" + diferencia + "USD para entrar en la promo");

        } else if (montoTotal >= 100 && montoTotal <= 300) {
            descuento = montoTotal * (0.05);
            totalConDec = montoTotal - descuento;
            System.out.println("por su compra tiene un decuento del 5% equivale a;" + descuento + " el moto total es de:" + totalConDec);
        } else {
            descuento = montoTotal * (0.10);
            totalConDec = montoTotal - descuento;
            System.out.println("por su compra tiene un decuento del 10% equivale a;" + descuento + " el moto total es de:" + totalConDec);

        }

    }
    
}
