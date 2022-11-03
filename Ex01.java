/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 1. Escriu un programa que demana dos números i mostra la suma.
 */
public class Ex01 {
    public static void main(String[] args) {
        //Declarem el lector de teclat
        Scanner lector = new Scanner(System.in);
        //Declarem els números sencers
        int num1=0,num2=0;
        //Declarem la variable on guardarem el resultat
        int resultat=0;
        
        //Demanem el primer número
        System.out.print("Donam el primer número: ");
        num1 = lector.nextInt();
        //Demanem el segon número
        System.out.print("Donam el segon número: ");
        num2 = lector.nextInt();
        
        //Calculem la suma
        resultat = num1 + num2;
        
        //Mostrem el resultat per pantalla
        System.out.println("La suma de " + num1 + " i " + num2 + " es: " + resultat);
    }
}
