/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 10. Escriu un programa en el qual l’usuari va inserint paraules, 
 * a cada paraula inserida el sistema dirà si té més caràcters o menys 
 * que l’anterior i quants.
 */
public class Ex10 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem la variable on guardarem la paraula
        String paraula;
        //Declarem les variables on guardarem la quantitat de lletres actuals
        //i anterior, les inicialitzem per saber si anterior és 0, vol dir que 
        //no s'ha executat encara
        int quantitatLletres = 0, quantitatLletresAnterior = 0;
        //Declarem opcio per continuar al bucle
        int opcio = 1;
        
        do {
            //Demanem la paraula
            System.out.println("Donam una paraula");
            paraula = lector.nextLine();
            //guardem la quantitat de lletres
            quantitatLletres = paraula.length();

            //si és la primera vegada que executem, anterior és 0
            if (quantitatLletresAnterior == 0) {
                System.out.println("És la primera paraula...");
                System.out.println("Té " + quantitatLletres + " lletres.");
            } else {
                //Avaluem on hi ha més lletres
                if (quantitatLletres > quantitatLletresAnterior) {
                    System.out.println("Té " + (quantitatLletres - quantitatLletresAnterior) + " lletres més que l'anterior.");
                } else if(quantitatLletres < quantitatLletresAnterior) {
                    System.out.println("Té " + (quantitatLletresAnterior-quantitatLletres) + " lletres menys que l'anterior.");
                }else{
                    //tenen el mateix número de lletres
                    System.out.println("Tenen el mateix número de lletres.");
                }
            }
            //assignem el número de lletres a anterior
            quantitatLletresAnterior = quantitatLletres;

            //demanem si volem continuar
            System.out.println("");
            System.out.print("Polsa 0 per finalitzar o 1 per continuar... ");
            System.out.println("");
            opcio = lector.nextInt();            
            lector.nextLine();
            
        } while (opcio == 1);
    }
}
