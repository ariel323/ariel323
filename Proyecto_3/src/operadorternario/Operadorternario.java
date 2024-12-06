
package operadorternario;

import java.util.Scanner;

public class Operadorternario {

    public static void main(String[] args) {
   
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese el  promedio del alumno");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio>=6) ? "Aprobado" : "desprobado";
        
        System.out.println(" la condicion final del alunmo es :" + condicionFinal + " el promedio fue: " + promedio);
    }
    
}
