/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 22. Escriu un programa que treballa amb un array de 5 posicions amb dades de
 * persones (nom, cognoms, edat i telèfon). El programa llistarà les persones i
 * segons la que es seleccione, la guardarà en un altre array. En qualsevol
 * moment es podrà llistar l’array de persones seleccionades i aquestes poden
 * estar duplicades.
 *
 */
public class Ex22 {

    public static void main(String[] args) {

        int opcio = -1;
        Scanner lector = new Scanner(System.in);
        int idPersona = -1;

        String[][] persones = new String[5][4];
        String[][] personesSeleccionades = null;
        String[][] aux;

        //persona1
        persones[0][0] = "Nom1";
        persones[0][1] = "Cognoms1";
        persones[0][2] = "Edat1";
        persones[0][3] = "Telefon1";

        //persona2
        persones[1][0] = "Nom2";
        persones[1][1] = "Cognoms2";
        persones[1][2] = "Edat2";
        persones[1][3] = "Telefon2";

        //persona3
        persones[2][0] = "Nom3";
        persones[2][1] = "Cognoms3";
        persones[2][2] = "Edat3";
        persones[2][3] = "Telefon3";

        //persona4
        persones[3][0] = "Nom4";
        persones[3][1] = "Cognoms4";
        persones[3][2] = "Edat4";
        persones[3][3] = "Telefon4";

        //persona5
        persones[4][0] = "Nom5";
        persones[4][1] = "Cognoms5";
        persones[4][2] = "Edat5";
        persones[4][3] = "Telefon5";

        do {
            System.out.println("Selecciona una opció...");
            System.out.println("1. Llistar persones");
            System.out.println("2. Seleccionar persona");
            System.out.println("3. Llistar llista seleccionats");
            System.out.println("0. Sortir");
            opcio = lector.nextInt();

            switch (opcio) {
                case 1://1. Llistar persones
                    for (int i = 0; i < persones.length; i++) {
                        System.out.printf("Nom complet: %s %s, Edat: %s, Telèfon: %s\n",
                                persones[i][0], persones[i][1],
                                persones[i][2], persones[i][3]);
                        System.out.println("");
                    }
                    break;
                case 2://2. Seleccionar persona
                    for (int i = 0; i < persones.length; i++) {
                        System.out.println((i + 1) + ". " + persones[i][0] + " " + persones[i][1]);
                    }
                    idPersona = lector.nextInt() -1;

                    if (personesSeleccionades == null) { //encara no hi ha cap persona
                        personesSeleccionades = new String[1][4];

                        //copiem les dades
                        personesSeleccionades[0][0] = persones[idPersona][0];
                        personesSeleccionades[0][1] = persones[idPersona][1];
                        personesSeleccionades[0][2] = persones[idPersona][2];
                        personesSeleccionades[0][3] = persones[idPersona][3];
                    } else { //ja tenim persones seleccionades
                        // definim l'array aux amb una nova posició
                        aux = new String[personesSeleccionades.length + 1][personesSeleccionades[0].length];
                        //copiem personesSeleccionades
                        for (int i = 0; i < personesSeleccionades.length; i++) {
                            for (int j = 0; j < personesSeleccionades[i].length; j++) {
                                aux[i][j] = personesSeleccionades[i][j];
                            }
                        }
                        //copiem les dades a l'última posició
                        aux[aux.length - 1][0] = persones[idPersona][0];
                        aux[aux.length - 1][1] = persones[idPersona][1];
                        aux[aux.length - 1][2] = persones[idPersona][2];
                        aux[aux.length - 1][3] = persones[idPersona][3];

                        //intercanviem valors
                        personesSeleccionades = aux;

                    }

                    break;
                case 3://3. Llistar llista seleccionats
                    if (personesSeleccionades != null) {
                        for (int i = 0; i < personesSeleccionades.length; i++) {
                            System.out.printf("Nom complet: %s %s, Edat: %s, Telèfon: %s\n",
                                    personesSeleccionades[i][0], personesSeleccionades[i][1],
                                    personesSeleccionades[i][2], personesSeleccionades[i][3]);
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Encara no s'han seleccionat persones");
                    }
                    break;
                case 0:
                    System.out.println("Adéu...");
                default:
                    System.out.println("Opció incorrecta...");
            }

        } while (opcio != 0);
    }
}
