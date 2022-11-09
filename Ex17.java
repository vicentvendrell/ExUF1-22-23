/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 17. Escriu un programa que utilitza un array de dos dimensions. 
 * Demana les dues dimensions a l’usuari i rellena l'array amb les 
 * seves posicions.
 * 
 */
public class Ex17 {
    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem les variables on guardarem les dimensions de l'array
        int dimensio1,dimensio2;
        
        //demanem les dimensions a l'usuari
        System.out.print("Donam la primera dimensió: ");
        dimensio1= lector.nextInt();
        System.out.print("Donam la segona dimensió: ");
        dimensio2= lector.nextInt();
        
        //Declarem l'array amb les dimensions que ens dóna l'usuari
        String[][] matriu = new String[dimensio1][dimensio2];
       
        //Assignem els valors a cadascuna de les posicions
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=i + "" + j;                
            }
        }
        
        //mostrem el contingut de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                //sortiran tots els valor de la posició i a la mateixa línia
                System.out.print(matriu[i][j]+ " ");
            }
            //Aquest salt de línia, separa cada valor de i
            System.out.println("");
        }
        
    }
}
