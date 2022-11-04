/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 11. Escriu un programa en el qual l’usuari va ingressant paraules. 
 * A cada paraula, el programa ha de mostrar la paraula i la quantitat 
 * de caràcters que té. Primer es mostra en majúscula i desprès en mínúscula 
 * (a cada nova paraula canvia). Finalitza en polsar 0.
 */
public class Ex11 {
    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Variable per guardar la paraula
        String paraula;
        //variable per guardar si toca minúscula o majúscula
        //aquesta variable va canviant a cada passada
        boolean minuscula=true;
        
        //variable per continuar o no
        int opcio=-1;
        do{
            //Demanem la paraula a l'usuari
            System.out.print("Donam una paraula: ");
            paraula=lector.nextLine();
            //comprovem si toca minúscula o majúscula
            if(minuscula){
                //passem la paraula a minúscules
                paraula = paraula.toLowerCase();
                //modifiquem la variable booleana
                minuscula=false;
            }else{
                //passem la paraula a majúscules
                paraula = paraula.toUpperCase();
                //modifiquem la variable booleana
                minuscula=true;
            }
           
            //mostrem missatge amb minúscules i els caràcters
            System.out.println("Paraula en "
                                + ((!minuscula) ? "minúscula" : "majúscula") 
                                + ": " + paraula
                                + " quantitat de caràcters: " 
                                + paraula.length() );
            
            //Demanem si volem continuar
            System.out.println("Vols continuar? 1.Si, 0.No.....");
            opcio=lector.nextInt();
            //Vuidem el buffer
            lector.nextLine();
        }while(opcio!=0);
        
    }
}
