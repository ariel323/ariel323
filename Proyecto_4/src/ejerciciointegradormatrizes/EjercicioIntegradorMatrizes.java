
package ejerciciointegradormatrizes;

import java.util.Scanner;

public class EjercicioIntegradorMatrizes {

    
    public static void main(String[] args) {
        double notas[][]= new double[4][3];
        double promedios []= new double[4];
        Scanner teclado = new Scanner (System.in); 
        for (int f=0; f<notas.length;f++){
            System.out.println("ingrese la 3 nota del alumno:" + (f+1));
            for (int c=0; c<notas[0].length;c++){
                 notas[f][c]= teclado.nextDouble();
        }
        }
        double total;
         for (int f=0; f<notas.length;f++){
             total=0;
          for (int c=0; c<notas[0].length;c++) {
              total=total + notas[f][c];
}
          promedios [f] = total / notas[0].length;
          
}
          for (int f=0; f<notas.length;f++){
              System.out.println("las notas del alumno son :" + (f+1) + " son:");
           for (int c=0; c<notas[0].length;c++){  
               System.out.println(notas[f][c]);
           }  
              System.out.println("el promedio fue;" + promedios[f]);
    }
}
    
    }