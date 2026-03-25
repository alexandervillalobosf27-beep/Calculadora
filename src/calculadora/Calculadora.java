/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Pc41
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA ===");
        
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("\nSelecciona una opción:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                Suma s = new Suma();
                System.out.println("Resultado: " + s.sumar(num1, num2));
                break;
                
            case 2:
                Resta r = new Resta();
                System.out.println("Resultado: " + r.restar(num1, num2));
                break;
                
            default:
                System.out.println("Opción no válida");
        }
    }
    }
    

