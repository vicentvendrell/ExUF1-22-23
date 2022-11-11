/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * 20. Escriu un programa que emmagatzema dades de 5 persones i en concret
 * guarda, el nom, cognoms, edat i telèfon. Les dades es guardaran en un array.
 * El programa ha de poder llistar totes les persones, seleccionar un persona i
 * sortir del programa. Si es selecciona una persona es podran llistar les seves
 * dades o modificar-les.
 *
 */
public class Ex20 {

    public static void main(String[] args) {
        //Declarem el lector
        Scanner lector = new Scanner(System.in);
        //Declarem l'array de cadenes de text per emmagatzemar les persones
        String[][] persones = new String[5][4];
        //variable per seleccionar una opció
        int opcio = -1;
        //variable per seleccionar la persona
        int idPersona = -1;
        //variable per seleccionar l'opcio de la persona(llistar/modificar)
        int opcioPersona = -1;

        //Demanem les dades dels 5 usuaris
        System.out.println("Insereix les dades de les persones...");
        for (int i = 0; i < persones.length; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.print("Nom: ");
            persones[i][0] = lector.nextLine();
            System.out.print("Cognoms: ");
            persones[i][1] = lector.nextLine();
            System.out.print("Edat: ");
            persones[i][2] = lector.nextLine();
            System.out.print("Telèfon: ");
            persones[i][3] = lector.nextLine();
            System.out.println("");
        }

        do {
            System.out.println("Selecciona una opció...");
            System.out.println("1. Llitar totes les persones");
            System.out.println("2. Seleccionar una persona");
            System.out.println("3. Afegir persona");
            System.out.println("4. Eliminar persona");
            System.out.println("0. Sortir");

            //validem que està inserint un número sencer
            while (!lector.hasNextInt()) {
                System.out.println("Has de seleccionar una opció");
                lector.next();
            }
            opcio = lector.nextInt();

            switch (opcio) {
                case 1://1. Llitar totes les persones
                    //mostrem les dades de totes les persones
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Persona " + (i + 1));
                        System.out.printf("Nom complet: %s %s, Edat: %s, Telèfon: %s\n",
                                persones[i][0], persones[i][1], persones[i][2], persones[i][3]);
                        System.out.println("");
                    }
                    break;
                case 2://2. Seleccionar una persona
                    do {
                        System.out.println("Selecciona una persona de les següents...");
                        //mostrem el nom de totes les persones
                        for (int i = 0; i < persones.length; i++) {
                            System.out.println((i + 1) + ". " + persones[i][0] + " " + persones[i][1]);
                        }
                        while (!lector.hasNextInt()) {
                            System.out.println("Has de posar un número entre 1 i " + persones.length);
                            lector.next();
                        }
                        idPersona=lector.nextInt();
                    } while (idPersona < 1 || idPersona > persones.length);

                    //Un cop seleccionada la persona, podrem llistar les seves dades o modificar-les
                    do {
                        System.out.println("Selecciona quina acció vols dur a terme...");
                        System.out.println("1. Llistar dades de la persona");
                        System.out.println("2. Modificar les dades de la persona");
                        opcioPersona = lector.nextInt();

                        switch (opcioPersona) {
                            case 1://1. Llistar dades de la persona
                                System.out.printf("Nom complet: %s %s, Edat: %s, Telèfon: %s\n",
                                        persones[idPersona-1][0], persones[idPersona-1][1],
                                        persones[idPersona-1][2], persones[idPersona-1][3]);
                                System.out.println("");
                                break;
                            case 2://2. Modificar les dades de la persona
                                System.out.println("Persona " + (idPersona));
                                System.out.println("Nom: ");
                                persones[idPersona-1][0] = lector.nextLine();
                                System.out.print("Cognoms: ");
                                persones[idPersona-1][1] = lector.nextLine();
                                System.out.print("Edat: ");
                                persones[idPersona-1][2] = lector.nextLine();
                                System.out.print("Telèfon: ");
                                persones[idPersona-1][3] = lector.nextLine();
                                System.out.println("");
                                System.out.println("Dades modificades correctament...");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opció incorrecta, has de seleccionar 1. llistar o 2. modificar...");
                        }
                    } while (opcioPersona != 1 && opcioPersona != 2);

                    break;
                case 3://3. Afegir persona
                    
                    break;
                case 4://Eliminar persona
                    
                    break;
                case 0://0. Sortir
                    System.out.println("Adéu...");
                    break;
                default:
                    System.out.println("Opció incorrecta...");
            }

        } while (opcio != 0);

    }
}
