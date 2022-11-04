/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 12. Escriu un programa en el qual l’usuari ingressa una frase. 
 * El programa mostrarà la frase de forma creixent caràcter a caràcter
 * (primer el primer caràcter, desprès el primer i el segon caràcter, 
 * desprès el primer, segon i tercer caràcter, i així fins completar 
 * la frase).
 * 
 */
public class Ex12 {
    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        
        //variable per guardar la frase
        String frase="";
        
        //Demanem la frase a l'usuari
        System.out.print("Escriu una frase: ");
        frase = lector.nextLine();
        
        System.out.println("Frase: " 
                        + frase + " longitud: " 
                        + frase.length());
        
        for(int i=0;i<frase.length();i++){
            System.out.println(i + ". " + frase.substring(0, i+1));
        }
    }
}
