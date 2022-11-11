/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 19. Escriu un programa que emmagatzema dades de 5 persones i en concret
 * guarda, el nom, cognoms, edat i telèfon. Les dades es guardaran en un array.
 * Llista les dades de totes les persones.
 *
 */
public class Ex19 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem l'array de cadenes de text per emmagatzemar les persones
        String[][] persones = new String[5][4];

        System.out.println("Insereix les dades de les persones...");
        for (int i = 0; i < persones.length; i++) {
            System.out.println("Persona " + (i + 1));
            persones[i][0] = lector.nextLine();
            System.out.print("Cognoms: ");
            persones[i][1] = lector.nextLine();
            System.out.print("Edat: ");
            persones[i][2] = lector.nextLine();
            System.out.print("Telèfon: ");
            persones[i][3] = lector.nextLine();
            System.out.println("");
        }

        //mostrem les dades de totes les persones
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.printf("Nom complet: %s %s, Edat: %s, Telèfon: %s\n",
                    persones[i][0], persones[i][1], persones[i][2], persones[i][3]);
//            System.out.print("Nom: " + persones[i][0]);
//            System.out.print("Cognoms: " + persones[i][1]);
//            System.out.print("Edat: " + persones[i][2]);
//            System.out.print("Telèfon: " + persones[i][3]);
            System.out.println("");
        }
    }

}
