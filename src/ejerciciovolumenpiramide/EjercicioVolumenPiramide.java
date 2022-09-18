/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovolumenpiramide;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class EjercicioVolumenPiramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        double altura;
        double lado;
        
        // Variables de salida
        double volumen;		
        int equivalencia;

        // Variables auxiliares
        double areaBase;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VOLUMEN DE PIRÁMIDE");
        System.out.println("-------------------");
        
        System.out.print("Introduce la altura de la pirámide (metros): ");
        altura=teclado.nextDouble();

        System.out.print("Introduce la longitud del lado de la base (metros): ");
        lado=teclado.nextDouble();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        areaBase= lado * lado;                  // Cálculo del área de la base
        volumen= (1.0/3.0) * areaBase * altura; // Cálculo del volumen
        equivalencia= (int)(volumen/2500);      // Cálculo de la equivalencia en piscinas olímpìcas
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------       
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println("Volumen de la pirámide: " + volumen + " metros cúbicos.");
        System.out.println("Equivale aproximadamente a " + equivalencia + " piscinas olímpicas.");
                
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");
    }
    
}
