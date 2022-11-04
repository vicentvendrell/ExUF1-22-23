/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author super
 */
public class Ex11bis {

    public static void main(String[] args) {
        //Declarem el lector de teclat
        Scanner lector = new Scanner(System.in);
        //Variable on guardarem la cadena de text o paraula
        String paraula = "";
        //num caracters de la paraula
        int numCaracters = 0;
        //variable per continuar amb una altra cadena de text
        int opcio = 1;
        //controlem si és o no majúscula
        boolean majuscula = true;

        do {
            //Demanar una paraula
            System.out.println("Donam una paraula...");
            paraula = lector.nextLine();
            numCaracters = paraula.length();

            //
            if (majuscula) {
                //mostraré la parual a majúscula
                System.out.println("Paraula " + paraula.toUpperCase());
                //majuscula = false;
            } else {
                //mostraré la paraula a minúscula
                System.out.println("Paraula " + paraula.toLowerCase());
                //majuscula = true;
            }
            
            majuscula = !majuscula;
                
            //Demanem si vol continuar
            System.out.println("Vols continuar? (1.Si, 0.No");
            opcio = lector.nextInt();
            lector.nextLine();

        } while (opcio == 1);
    }
}
