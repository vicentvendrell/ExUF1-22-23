/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 18. Escriu un programa que guarda en un array bidimensional les taules de
 * multiplicar de l’1 al 10. Mostra totes les taules. Modifica el programa
 * perquè doni la possibilitat de mostrar una única taula o totes.
 *
 */
public class Ex18 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem l'array
        int[][] taules = new int[10][10];
        //variable per comprovar l'opció que marca l'usuari
        int opcio = -1;
        //taula de multiplicar
        int taula = -1;

        //rellenem les taules de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                taules[i][j] = (i + 1) * (j + 1);
            }
        }

        //bucle on anem demanant opcions
        do {
            System.out.println("Selecciona una opció...");
            System.out.println("1.Mostrar taula completa (format taula)");
            System.out.println("2.Mostrar totes les taules amb format");
            System.out.println("3.Mostrar una taula de multiplicar");
            System.out.println("0.Sortir");

            //validem que està inserint un número sencer
            while (!lector.hasNextInt()) {
                System.out.println("Has de seleccionar una opció");
                lector.next();
            }
            opcio = lector.nextInt();

            switch (opcio) {
                case 1://1.Mostrar taula completa (format taula)
                    //motrem la taula
                    //Imprimim la capçalera
                    System.out.print("    ");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%2s ", i + 1);
                    }
                    //imprimim els guions
                    System.out.println("");
                    for (int i = 0; i <= 10; i++) {
                        System.out.printf("%2s", "---");
                    }
                    System.out.println("");
                    //System.out.println("    ----------------------------");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%2s| ", i + 1);
                        for (int j = 0; j < 10; j++) {
                            //System.out.print(taules[i][j]+ "  ");
                            System.out.printf("%2s ", taules[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 2://2.Mostrar totes les taules amb format
                    System.out.println("");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Taula de multiplicar del: " + (i + 1));
                        for (int j = 0; j < 10; j++) {
                            System.out.println((i + 1) + " x " + (j + 1) + " = " + taules[i][j] + "  ");
                        }
                        System.out.println("");
                    }

                    break;
                case 3://3.Mostrar una taula de multiplicar
                    do {
                        System.out.println("Selecciona quina taula de multiplicar vols (1..10)");
                        //validem que està inserint un número sencer
                        while (!lector.hasNextInt()) {
                            System.out.println("Has de seleccionar un número entre 1 i 10");
                            lector.next();
                        }
                        taula = lector.nextInt();
                    } while (taula < 1 || taula > 10);

                    System.out.println("Taula de multiplicar del " + taula);
                    for (int i = 0; i < 10; i++) {
                        System.out.println((taula) + " x " + (i + 1) + " = " + taules[taula-1][i] + "  ");
                    }
                    System.out.println("");
                    
                    break;
                case 0://0.Sortir
                    System.out.println("Adèu...");
                    break;
                default:
                    System.out.println("Opció incorrecta...");
            }

        } while (opcio != 0);

    }
}
