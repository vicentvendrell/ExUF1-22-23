/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

/**
 *
 * 16. Escriu un programa que utilitza un array de dos dimensions (5,5) i
 * rellena-la amb el valor de les dues dimensions.
 *
 */
public class Ex16 {

    public static void main(String[] args) {

        //declarem l'array amb les seves dimensions
        int[][] matriu = new int[5][5];

        //complim la matriu amb els seus valors
        //matriu.length ens diu la longitud de la primera dimensió
        //matriu[i].length ens diu la longitud de la segona dimensió
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = Integer.valueOf(String.valueOf(i)+String.valueOf(j));
            }
        }
        //mostrem la matriu i els seus valors
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(i + "-" + j+ ":"+matriu[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
