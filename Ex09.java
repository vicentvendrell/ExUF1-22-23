/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 9. Escriu un programa que demana un número i el número de repeticions a fer. 
 * Ha de mostrar els números anteriors al número especificat és a dir s’ha de 
 * mostrar en orde decreixent. Exemple: 1r número 25, 2n número 5, 
 * mostrarà 25, 24, 23, 22, 21, 20.
 */
public class Ex09 {
    public static void main(String[] args) {
        //Declarem el lector de dades de teclat
        Scanner lector = new Scanner(System.in);
        
        //Declarem la variable on guardarem el número que demanem a l'usuari
        int num,repeticions;
        
        //Demanem el número a l'usuari
        System.out.print("Donam un número: ");
        num=lector.nextInt();
        System.out.print("Donam el número de repeticions a fer: ");
        repeticions=lector.nextInt();
        
        //Mostrem els números per pantalla
        for(int i=repeticions;repeticions>=0;repeticions--){
            System.out.println("Número: " + num);
            num--;
        }
    }
}
