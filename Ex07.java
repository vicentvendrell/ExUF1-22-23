/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 7. Escriu un programa que tradueix la nota numèrica a lletra on menos de 5 és
 * E, 5 és D, entre 6 i 7 és C, entre 8 i 9 és B i 10 és A.
 */
public class Ex07 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Variable per guardar la nota
        double nota;
        //variable per continuar al bucle
        boolean continuar = true;
        //variable per capturar l'opció de l'usuari
        char opcio = ' ';
        //variable per guardar la nota en forma lletra
        char notaLletra = ' ';
        //variable per guardar si l'opció és correcta
        boolean opcioIncorrecta = false;
        
        do {
            //Demanem la nota
            System.out.print("Donam la nota amb decimals: ");
            nota = lector.nextDouble();

            //Avaluem el valor de la nota
            if (nota < 5) {
                notaLletra = 'E';
            } else if (nota >=5 && nota<6) {
                notaLletra = 'D';
            }else if (nota>=6 && nota<8){
                notaLletra='C';
            }else if (nota>=8 && nota<10){
                notaLletra='B';
            }else{
                notaLletra='A';
            }

            //Mostrem la nota en format lletra
            System.out.println("La teva nota " + nota + " és: " + notaLletra);
            
            opcioIncorrecta = true;
            do {
                //Demanem si vol continuar
                System.out.println("Vols continuar? (S/N)");
                //Capturem el caràcter
                opcio = lector.next().charAt(0);
                switch (opcio) {
                    case 's','S':
                        opcioIncorrecta = false;
                        continuar = true;
                        break;
                    case 'n', 'N':
                        opcioIncorrecta = false;
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opció incorrecta, escriu \"S\" o \"N\"");
                        break;
                }
            } while (opcioIncorrecta);

        } while (continuar);
    }
}
