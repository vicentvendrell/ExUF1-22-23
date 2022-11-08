/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

/**
 *
 * 13. Escriu un programa que utilitza 10 posicions. Has d’inicialitzar l’array
 * començant pel valor 1 i a cada posició li incrementaràs el valor en 1.
 */
public class Ex13 {

    public static void main(String[] args) {
        //Declarem l'array de n posicions
        int n = 10;
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
        
        //mostrem el vector
        for(int i=0;i<vector.length; i++){
            System.out.println("Posició " + i + " - " + vector[i]);
        }
    }
}
