package n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    final static ArrayList<Floristeria> llistaFloristeries = new ArrayList<>();
    final static ArrayList<Ticket> llistaTickets = new ArrayList<>();

    public static void main(String[] args) {
        iniciAppFloristeria();
    }

    static void iniciAppFloristeria() {
        int opcioIntUsuari = -1;

        while(opcioIntUsuari != 0) {
            printMenu();
            opcioIntUsuari = opcioIntUsuari("Escull opcio: ");
            operacioGestioFloristeria(opcioIntUsuari);
        }
    }

    static void printMenu() {
        System.out.println(
                "\n Menu aplicació \n" +
                        "1. Crear floristeria \n" +
                        "2. Afegir arbre \n" +
                        "3. Afegir flor \n" +
                        "4. Afegir decoracio \n" +
                        "5. Veure stock detallat floristeria \n" +
                        "6. Retirar arbre \n" +
                        "7. Retirar flor \n" +
                        "8. Retirar decoracio \n" +
                        "9. Veure stock en quantitats \n" +
                        "10. Veure valor total floristeria \n" +
                        "0. Sortir aplicacio"
        );
    }

    static double opcioNumUsuari(String msg) {
        System.out.println(msg);
        double opcioNumUsuari = -1;
        Scanner sc = new Scanner(System.in);
        opcioNumUsuari = sc.nextDouble();
        sc.nextLine();
        return opcioNumUsuari;
    }

    static int opcioIntUsuari(String msg) {
        System.out.println(msg);
        int opcioIntUsuari = -1;
        Scanner sc = new Scanner(System.in);
        opcioIntUsuari = sc.nextInt();
        sc.nextLine();
        return opcioIntUsuari;
    }

    static String opcioStrUsuari(String msg) {
        System.out.println(msg);
        String opcioStrUsuari = "";
        Scanner sc = new Scanner(System.in);
        opcioStrUsuari = sc.nextLine();
        return opcioStrUsuari;
    }

    static int indexFloristeria(String nom) {
        int indexFloristeria = -1;
        int i = 0;

        while(indexFloristeria == -1 && i < llistaFloristeries.size()) {
            if(llistaFloristeries.get(i).getNom().toLowerCase().equals(nom.toLowerCase())) {
                indexFloristeria = i;
            }
            i++;
        }

        return indexFloristeria;
    }


    static void operacioGestioFloristeria(int opcioIntUsuari) {

        switch(opcioIntUsuari) {
            case 1:
                crearFloristeria(
                        opcioStrUsuari("Introduir nom Floristeria a crear: ")
                );
                break;
            case 2:
                afegirArbre(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir alzada: "),
                        opcioNumUsuari("Introduir preu: ")
                );
                break;
            case 3:
                afegirFlor(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir color: "),
                        opcioNumUsuari("Introduir preu: ")
                );
                break;
            case 4:
                afegirDecoracio(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir fusta o plàstic: "),
                        opcioNumUsuari("Introduir preu: ")
                );
                break;
            case 5:
                printarStockDescripcio(
                        opcioStrUsuari("Introduir nom Floristeria per veure Stock detallat: ")
                );
                break;
            case 6:
                retirarArbre(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir alzada: ")
                );
                break;
            case 7:
                retirarFlor(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir color: ")
                );
                break;
            case 8:
                retirarDecoracio(
                        opcioStrUsuari("Introduir nom Floristeria: "),
                        opcioStrUsuari("Introduir fusta o plàstic: ")
                );
                break;
            case 9:
                printarStockQuantitats(
                        opcioStrUsuari("Introduir nom Floristeria per veure Stock en Quantitats: ")
                );
                break;
            case 10:
                printarValorTotal(
                        opcioStrUsuari("Introduir nom Floristeria per veure Valor Total: ")
                );
                break;
            case 0:
                System.out.println("Sortint de l'aplicació...");
                break;
            default:
                System.out.println("Opción no vàlida, elegir entre 0 - 13");

        }
    }




    static void crearFloristeria(String nom) {

        if(indexFloristeria(nom) == -1) {
            Floristeria novaFloristeria = new Floristeria();
            novaFloristeria.setNom(nom);
            llistaFloristeries.add(novaFloristeria);
        } else {
            System.out.println("La Floristeria " + nom + " ja estava creada.");
        }
    }

    static void afegirArbre(String nomFloristeria, String alzada, double preu) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        Arbre nouArbre = new Arbre(alzada, preu);
        llistaFloristeries.get(indexFloristeria).getLlistaArbres().add(nouArbre);
    }

    static void retirarArbre(String nomFloristeria, String alzada) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        int indexArbre = llistaFloristeries.get(indexFloristeria).indexArbre(alzada);

        if(indexArbre != -1) {
            llistaFloristeries.get(indexFloristeria).getLlistaArbres().remove(indexArbre);
        } else {
            System.out.println("L'arbre amb" + alzada + " no es troba a l'aplicació.");
        }
    }
    static void afegirFlor(String nomFloristeria, String color, double preu) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        Flor novaFlor = new Flor(color, preu);
        llistaFloristeries.get(indexFloristeria).getLlistaFlors().add(novaFlor);
    }

    static void retirarFlor(String nomFloristeria, String color) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        int indexFlor = llistaFloristeries.get(indexFloristeria).indexFlor(color);

        if(indexFlor != -1) {
            llistaFloristeries.get(indexFloristeria).getLlistaFlors().remove(indexFlor);
        } else {
            System.out.println("La Flor amb" + color + " no es troba a l'aplicació.");
        }
    }

    static void afegirDecoracio(String nomFloristeria, String fustaOplastic, double preu) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        Decoracio novaDecoracio = new Decoracio(fustaOplastic, preu);
        llistaFloristeries.get(indexFloristeria).getLlistaDecoracions().add(novaDecoracio);
    }

    static void retirarDecoracio(String nomFloristeria, String fustaOplastic) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        int indexDecoracio = llistaFloristeries.get(indexFloristeria).indexDecoracio(fustaOplastic);

        if(indexDecoracio != -1) {
            llistaFloristeries.get(indexFloristeria).getLlistaDecoracions().remove(indexDecoracio);
        } else {
            System.out.println("La Decoracio amb" + fustaOplastic + " no es troba a l'aplicació.");
        }
    }


    private static void printarStockDescripcio(String nomFloristeria) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        System.out.println(llistaFloristeries.get(indexFloristeria).getLlistaArbres());
        System.out.println(llistaFloristeries.get(indexFloristeria).getLlistaFlors());
        System.out.println(llistaFloristeries.get(indexFloristeria).getLlistaDecoracions());
    }

    private static void printarStockQuantitats(String nomFloristeria) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        System.out.println("Quantitat Arbres: " + llistaFloristeries.get(indexFloristeria).getLlistaArbres().size());
        System.out.println("Quantitat Flors: " + llistaFloristeries.get(indexFloristeria).getLlistaFlors().size());
        System.out.println("Quantitat Decoracions: " + llistaFloristeries.get(indexFloristeria).getLlistaDecoracions().size());
    }

    private static void printarValorTotal(String nomFloristeria) {
        int indexFloristeria = indexFloristeria(nomFloristeria);
        ArrayList<Arbre> llistaArbres = llistaFloristeries.get(indexFloristeria).getLlistaArbres();
        double resultatArbres = 0;
        for(Arbre a : llistaArbres) {
            resultatArbres += a.getPreu();
        }

        ArrayList<Flor> llistaFlors = llistaFloristeries.get(indexFloristeria).getLlistaFlors();
        double resultatFlors = 0;
        for(Flor f : llistaFlors) {
            resultatFlors += f.getPreu();
        }

        ArrayList<Decoracio> llistaDecoracions = llistaFloristeries.get(indexFloristeria).getLlistaDecoracions();
        double resultatDecoracions = 0;
        for(Decoracio d : llistaDecoracions) {
            resultatDecoracions += d.getPreu();
        }

        double resultatTotal = resultatArbres + resultatFlors + resultatDecoracions;

        System.out.println("Valor dels arbres: " + resultatArbres);
        System.out.println("Valor de les flors: " + resultatFlors);
        System.out.println("Valor de les decoracions: " + resultatDecoracions);
        System.out.println("Valor Total productes: " + resultatTotal);

    }


}
