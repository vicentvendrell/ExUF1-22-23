/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 *  6. Escriu un programa a l’estil d’una factura. El programa 
 * anirà demanant articles (descripció, preu unitari, quantitat 
 * d’unitats). El programa anirà demanant si volem afegir més 
 * productes. En el moment que no es vulguin posar més articles, 
 * el programa mostrarà un resum amb tota la informació introduida,
 * l’import total i l’import amb iva.
 */
public class Ex06 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem les variables de cada article
        String descripcio;
        double preuUnitari;
        int quantitat;
        //En aquesta variable anirem guardant tots els articles com una 
        //cadena de test molt llarga
         String articles = "";
         //En aquesta variable guardarem el acumulat de tots els articles
        double importTotal = 0.0;
        
        //Declarem i inicialitzem la variable que ens permet continuar al bucle
        int opcio = 1;
        
        do {
            //Demanem les dades de cada article
            System.out.println("Introdueix un article...");
            System.out.print("Donam la descripció: ");
            descripcio = lector.nextLine();
            
            System.out.print("Donam el preu unitari: ");
            preuUnitari = lector.nextDouble();
            
            System.out.print("Donam la quantitat: ");
            quantitat = lector.nextInt();
            System.out.println("");
            
            //Vuidem el buffer de possibles \n
            lector.nextLine();
            
            //guardem l'article actual
            articles = articles 
                    + descripcio + " " 
                    + preuUnitari + " " 
                    + quantitat + "\n";
            //Calculem l'import total fins ara
            importTotal = importTotal + (preuUnitari * quantitat);
            
            //demanem si volem continuar
            System.out.println("");
            System.out.print("Polsa 0 per finalitzar o 1 per continuar... ");
            System.out.println("");
            opcio = lector.nextInt();  
            //vuidem el buffer desprès de llegir un int
            lector.nextLine();
            
        } while (opcio == 1); //comparem
        
        //mostrem els resultats
        System.out.println("");
        System.out.println("Llista d'articles");
        System.out.println(articles);
        System.out.println("Import total: " + importTotal);
        System.out.println("Import amb iva: " + importTotal * 1.21);
    }
   
}
