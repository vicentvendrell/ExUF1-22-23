/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**4. Escriu un programa que permet calcular la nota 
 * final de M3 considerant que la nota final és 15%UF1 
 * + 15%UF2 + 10%UF3 + 20%UF4 + 20%UF5 + 20%UF6
 */

package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 4. Escriu un programa que permet calcular la nota final de 
 * M3 considerant que la nota final és 
 * 15%UF1 + 15%UF2 + 10%UF3 + 20%UF4 + 20%UF5 + 20%UF6
 */
public class Ex04 {
    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem les variables on pasarem les notes de cada UF
        //Pensem que les notes seran números sencers
        int uf1,uf2,uf3,uf4,uf5,uf6;
        //La nota final sera un número amb decimals
        double notaM3;
        
        //Demanem una a una les notes de cada UF
        System.out.println("Donam la nota de la UF1");
        uf1=lector.nextInt();
        System.out.println("Donam la nota de la UF2");
        uf2=lector.nextInt();
        System.out.println("Donam la nota de la UF3");
        uf3=lector.nextInt();
        System.out.println("Donam la nota de la UF4");
        uf4=lector.nextInt();
        System.out.println("Donam la nota de la UF5");
        uf5=lector.nextInt();
        System.out.println("Donam la nota de la UF6");
        uf6=lector.nextInt();
        
        //Calculem la nota 
        notaM3=uf1*0.15+uf2*0.15+uf3*0.1+uf4*0.2+uf5*0.2+uf6*0.2;
        
        //La mostrem per pantalla
        System.out.println("La nota de m3 és: " + notaM3);
    }
}
