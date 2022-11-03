/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 5. Escriu un programa que demana dades d’un usuari 
 * (nom, cognom, email i telèfon). Mostra les dades de 
 * l’usuari amb format utilitzant la funció printf. El 
 * programa demanarà si volem continuar i tornarà a 
 * demanar les dades.
 */
public class Ex05 {
    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem una variable per continuar al bucle
        boolean continuar = true;
        int opcio = 0; //guarem l'opció que inserta l'usuari
        
        //Variables per guardar dades de l'usuari
        String nom,cognom,email,telefon;
        
        while(continuar){
            
            //Demanem les dades a l'usuari
            System.out.print("Escriu el teu nom: ");
            nom = lector.nextLine();
            System.out.print("Escriu els teus cognoms: ");
            cognom=lector.nextLine();
            System.out.print("Escriu el teu email: ");
            email = lector.nextLine();
            System.out.print("Escriu el teu telèfon: ");
            telefon = lector.nextLine();
            
            //Insertem un salt de línea
            System.out.println("");
            
            //Mostrem les dades de l'usuari
            //Encara que està en diferents línies, ho mostra tot a la mateixa línea
            //Ho he posat així perquè es visualitza millor
            System.out.println("Nom: " + nom +
                                ", Cognoms: " + cognom + 
                                ", Email: " + email + 
                                ", Telèfon: " + telefon);
            
            //Utilitzant printf
            System.out.printf("Non: %s, Cognoms: %s, Email: %s. Telèfon: %s\n",nom,cognom,email,telefon);
            
            //Demanem si volem continuar
            System.out.println("\nVols continuar amb un altre usuari? 1.Si, 0.No");
            opcio=lector.nextInt();
            if(opcio==0){
                continuar=false;
            }
        }
    }
}
