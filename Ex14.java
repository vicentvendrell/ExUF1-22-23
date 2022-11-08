/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

/**
 *
 *   14. Escriu un programa que genera 100 números aleatoris i els 
 * desa en un array. Finalment el programa mostrarà els números.
 * 
 */
public class Ex14 {
    public static void main(String[] args) {
        int n = 100;
        int[] aleatoris = new int[n];
        
        //Omplim l'array
        for(int i=0;i<aleatoris.length;i++){
            aleatoris[i]=(int) (Math.random()*10+1);
                    
        }
        
        //llegim l'array i mostrem per pantalla
        for(int i=0;i<aleatoris.length;i++){
            System.out.println("Posició: " + i + " Número: " + aleatoris[i]);
        }
    }
}
