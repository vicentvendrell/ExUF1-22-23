/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 3. Escriu un programa que simula una calculadora. L’usuari podrà seleccionar
 * l’operació mitjançant l’operador (+, -, *, /).
 */
public class Ex03 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem les variables amb les quals posarem números
        int num1 = 0;
        int num2 = 0;
        int resultat = 0;
        //Declarem la variable on posarem l'operació
        char op = ' ';

        //Aquesta variable ens permetrà poder continuar al bucle
        //en cas que vulgui l'usuari
        int continuar = 1;

        do {
            //Demanem l'operació
            System.out.println("Quina operació vols realitzar?");
            System.out.println(" +, -, * o /");
            System.out.println("Selecciona un dels anteriors");

            //capturem l'operació
            //compte que no podem llegir un sol caràcter, llegim la 
            //línea sencera i agafem el primer caràcter
            op = lector.next().charAt(0);

            //Demanem els números
            System.out.println("Donam el primer número");
            num1 = lector.nextInt();
            System.out.println("Donam el segon número");
            num2 = lector.nextInt();
            lector.nextLine();

            //Segons l'opció seleccionem que fer
            switch (op) {
                case '+':
                    resultat = num1 + num2;
                    System.out.println("La suma és: " + resultat);
                    break;
                case '-':
                    resultat = num1 - num2;
                    System.out.println("La suma és: " + resultat);
                    break;
                case '/':
                    resultat = num1 / num2;
                    System.out.println("La suma és: " + resultat);
                    break;
                case '*':
                    resultat = num1 * num2;
                    System.out.println("La suma és: " + resultat);
                    break;
                default:
                    System.out.println("Opció incorrecta");
                    break;
            }

            //Denanem si es vol continuar
            System.out.println("1 si vols continuar...");
            continuar = lector.nextInt();
            //Amb aquesta instrucció vuidem el buffer de possibles salts de línea
            lector.nextLine();
            
        } while (continuar == 1);// comparació
    }
}
