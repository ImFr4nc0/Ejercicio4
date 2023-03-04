/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        int juan, alberto, ana, mama;
        System.out.println("Ingrese su edad: ");
        Scanner entrada = new Scanner(System.in);
        juan = entrada.nextInt();
        alberto = 2*(juan/3);
        ana = 4*(juan/3);
        mama = juan + alberto + ana;
        
        System.out.println("La edad de Juan es: " + juan);
        System.out.println("La edad de Alberto es: " + alberto);
        System.out.println("La edad de Ana es: " + ana);
        System.out.println("La edad de la Mama es: " + mama);
    }
    
}
