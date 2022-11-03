/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 8. Escriu una aplicació que calcula el salari d’un treballador en funció de
 * les hores extra i la seva categoria. Categoria 1: hora extra 12€ i salari
 * 1000€, categoria 2 hora extra 14€ i salari 1100€, categoria 3 hora extra 16€
 * i salari 1200€, categoria 4 hora extra 18€ i salari 1400€.
 */
public class Ex08 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);

        //Declarem les constants (hores extra i salaris base)
        int CATEGORIA_1_HORA_EXTRA = 12;
        int CATEGORIA_1_SALARI = 1000;
        int CATEGORIA_2_HORA_EXTRA = 14;
        int CATEGORIA_2_SALARI = 1100;
        int CATEGORIA_3_HORA_EXTRA = 16;
        int CATEGORIA_3_SALARI = 1200;
        int CATEGORIA_4_HORA_EXTRA = 18;
        int CATEGORIA_4_SALARI = 1400;

        //Declarem les variables on guardarem la categoria,
        //les hores extra de l'operari i el salari final
        int categoria; //nomes pot ser 1, 2, 3 o 4
        int horesExtra;
        //variables per guardar info i mostrar-la al final
        int salari = 0, salariBase = 0, preuHoraExtra = 0;

        System.out.println("Donam la informació del treballador...");
        System.out.print("Categoria? (1, 2, 3 o 4): ");
        categoria = lector.nextInt();
        System.out.println("Hores Extra?: ");
        horesExtra = lector.nextInt();

        switch (categoria) {
            case 1:
                salariBase = CATEGORIA_1_SALARI;
                preuHoraExtra = CATEGORIA_1_HORA_EXTRA;
                break;
            case 2:
                salariBase = CATEGORIA_2_SALARI;
                preuHoraExtra = CATEGORIA_2_HORA_EXTRA;
                break;
            case 3:
                salariBase = CATEGORIA_3_SALARI;
                preuHoraExtra = CATEGORIA_3_HORA_EXTRA;
                break;
            case 4:
                salariBase = CATEGORIA_4_SALARI;
                preuHoraExtra = CATEGORIA_4_HORA_EXTRA;
                break;
            default:
                System.out.println("No has seleccionat bé...");
        }

        salari = salariBase + preuHoraExtra * horesExtra;

        System.out.println("Salari del treballador...");
        System.out.println("Categoria: \t" + categoria);
        System.out.println("Salari base: \t" + salariBase);
        System.out.println("Hores extra: \t" + horesExtra);
        System.out.println("€ hores extra: \t" + preuHoraExtra);
        System.out.println("Total extra: \t" + horesExtra * preuHoraExtra);
        System.out.println("\t--------------");
        System.out.println("Salari final: \t" + salari);
    }
}
