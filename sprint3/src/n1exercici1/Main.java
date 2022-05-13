package n1exercici1;
/*
Exercici
Hem de crear un programa per a gestionar el catàleg de productes
d'una floristeria. En el nivell 1, gestiona la persistència en un fitxer TXT.

Aquest programa ha de complir els següents requeriments:
En una floristeria, que té un nom, tenim arbres, flors i decoració.
Cada arbre té una alçada.
Les flors tenen un color.
La decoració té un tipus de material: fusta o plàstic.
Tots tenen un preu.
Una floristeria ha de tenir un stock de cada un dels productes
 (arbres, flors i decoració).
La floristeria té un registre del valor total del stock que té.
S’ha de crear una classe ticket, on poder registrar les compres
en UNA sola llista.

Quant a les funcionalitats del Main, com a mínim, ha d’incloure les següents:
Crear Floristeria.
Afegir Arbre.
Afegir Flor.
Afegir Decoració.
Stock: Imprimeix per pantalla tots els arbres, flors i decoració
que té la floristeria.
Retirar arbre.
Retirar flor.
Retirar decoració.
Printar per pantalla stock amb quantitats.
Printar per pantalla valor total de la floristeria.
Crear tickets de compra amb múltiples objectes.
Mostrar una llista de compres antigues.
Visualitzar el total de diners guanyats amb totes les vendes.

EXAMPLE STOCK:
    ARBRES:
        TTTTTTTT
    FLORS:
        YYYYYYYY
    DECORACIÓ:
        XXXXXXXX

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    final static ArrayList<Floristeria> llistaFloristeries = new ArrayList<>();

    public static void main(String[] args) {
        iniciAppFloristeria();
    }

    static void iniciAppFloristeria() {
        int opcioNumUsuari = -1;

        while(opcioNumUsuari != 0) {
            printMenu();
            opcioNumUsuari = opcioNumUsuari("Escull opcio: ");
            operacioGestioFloristeria(opcioNumUsuari);
        }
    }

    static void printMenu() {
        System.out.println(
                "\n Menu aplicació \n" +
                        "1. Crear floristeria \n" +
                        "2. Afegir arbre \n" +
                        "3. Afegir flor \n" +
                        "3. Afegir decoracio \n" +
                        "3. Veure stock detallat floristeria \n" +
                        "3. Retirar arbre \n" +
                        "4. Retirar flor \n" +
                        "4. Retirar decoracio \n" +
                        "4. Veure stock en quantitats \n" +
                        "4. Veure calor total floristeria \n" +
                        "5. Crear ticket compra \n" +
                        "5. Veure llista tickets de compra \n" +
                        "5. Visualitzar benefici floristeria \n" +
                        "0. Sortir aplicacio"
        );
    }

    private static void operacioGestioFloristeria(int opcioNumUsuari) {

    }

    static int opcioNumUsuari(String msg) {
        System.out.println(msg);
        int opcioNumUsuari = -1;
        Scanner sc = new Scanner(System.in);
        opcioNumUsuari = sc.nextInt();
        sc.nextLine();
        return opcioNumUsuari;
    }
}
