/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 15. Escriu un programa que utilitza un array de 10 posicions i inicialitza
 * els seus valors amb números aleatòris. El programa mostrarà un menú per poder
 * inserir nous valors o eliminar valors (opció 1. Inserir valor i opcio
 * 2.Eliminar valor). Cada número pot estar present a l’array un màxim de dues
 * vegades.
 *
 */
public class Ex15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declarem l'array per guardar els números
        int[] aleatoris = new int[10];
        //variable per continuar al bucle
        int opcio = -1;
        int num;
        int contador;
        //array auxiliar
        int[] aux;

        //Omplim l'array
        for (int i = 0; i < aleatoris.length; i++) {
            aleatoris[i] = (int) (Math.random() * 10 + 1);
        }

        //iniciem el bucle
        do {
            System.out.println("Selecciona una opció:");
            System.out.println("1.Afegir número.");
            System.out.println("2.Eliminar número.");
            System.out.println("0.Sortir.");
            opcio = lector.nextInt();

            switch (opcio) {
                case 1: //1.Afegir número.
                    //Demanem un nou valor a l'usuari
                    System.out.println("Donam un nou valor...");
                    num = lector.nextInt();

                    //si ho volem fer amb un número aleatori seia així
                    //num=(int) (Math.random() * 10 + 1);
                    //Contem quantes vegades apareix el número a l'array
                    contador = 0;
                    for (int i = 0; i < aleatoris.length; i++) {
                        if (aleatoris[i] == num) {
                            contador++;
                        }
                    }

                    if (contador < 2) { //puc insertar
                        //Declarem un array d'una posició més
                        aux = new int[aleatoris.length + 1];
                        //copiem tots els nous valors
                        for (int i = 0; i < aleatoris.length; i++) {
                            aux[i] = aleatoris[i];
                        }
                        //Posem el valor que ha inserit l'usuari al final
                        aux[aux.length - 1] = num;

                        //intercanviem variables
                        aleatoris = aux;
                    } else {
                        System.out.println("No es pot insertar més vegades....");
                    }

                    break;
                case 2: //2.Eliminar número. 
                    //(suposem que eliminem el primer)
                    //Declarem un array d'una posició menys
                    aux = new int[aleatoris.length - 1];
                    //copiem els valors
                    for (int i = 0; i < aleatoris.length - 1; i++) {
                        aux[i] = aleatoris[i + 1];
                    }
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opció incorrecta...");
            }
        } while (opcio != 0);

    }
}
