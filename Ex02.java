/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 2. Escriu un programa que demana tres números i els mostra en orde decreixent (de menor a major).
 */
public class Ex02 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
       
        //Declarem els números
        int num1, num2, num3;    
        
        //Demanem els números
        System.out.println("Donam el primer número");
        num1 = lector.nextInt();
        System.out.println("Donam el segon número");
        num2 = lector.nextInt();
        System.out.println("Donam el tercer número");
        num3 = lector.nextInt();

        //Comencem a comparar
        //Aquesta part seria per orde decreixent
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);

            }
        }

        
        //Aquesta part seria per orde creixent
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if (num2 > num3) {
            if (num1 > num3) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else {
            if (num1 > num2) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num1 + " " + num2 + " " + num3);

            }
        }
        
    }
}
