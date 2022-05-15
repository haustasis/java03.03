package n1exercici1;

import java.util.ArrayList;

public class Floristeria {

    // atributs

    private String nom;
    private ArrayList<Arbre> llistaArbres;
    private ArrayList<Flor> llistaFlors;
    private ArrayList<Decoracio> llistaDecoracions;

    // constructor sense parametres
    public Floristeria() {
        nom = "";
        llistaArbres = new ArrayList<>();
        llistaFlors = new ArrayList<>();
        llistaDecoracions = new ArrayList<>();
    }

    // constructor amb parametres
    public Floristeria(String nom) {
        this.nom = nom;
        llistaArbres = new ArrayList<>();
        llistaFlors = new ArrayList<>();
        llistaDecoracions = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Arbre> getLlistaArbres() {
        return llistaArbres;
    }

    public void setLlistaArbres(ArrayList<Arbre> llistaArbres) {
        this.llistaArbres = llistaArbres;
    }

    public ArrayList<Flor> getLlistaFlors() {
        return llistaFlors;
    }

    public void setLlistaFlors(ArrayList<Flor> llistaFlors) {
        this.llistaFlors = llistaFlors;
    }

    public ArrayList<Decoracio> getLlistaDecoracions() {
        return llistaDecoracions;
    }

    public void setLlistaDecoracions(ArrayList<Decoracio> llistaDecoracions) {
        this.llistaDecoracions = llistaDecoracions;
    }

/*
    static void printLListaArbres() {
        for(int i = 0; i < llistaArbres.size(); i++) {
            System.out.println(llistaArbres.get(i).toString());
        }
    }
    static void printLListaFlors(ArrayList<Flor> llistaFlors) {
        for(int i = 0; i < llistaFlors.size(); i++) {
            System.out.println(llistaFlors.get(i).toString());
        }
    }

    static void printLListaDecoracions(ArrayList<Decoracio> llistaDecoracions) {
        for(int i = 0; i < llistaDecoracions.size(); i++) {
            System.out.println(llistaDecoracions.get(i).toString());
        }
    }

 */

    public int indexArbre(String alzada) {
        int indexArbre = -1;
        int i = 0;

        while(indexArbre == -1 && i < llistaArbres.size()) {
            if(llistaArbres.get(i).getAlzada().equalsIgnoreCase(alzada)
            ) {
                indexArbre = i;
            }
            i++;
        }

        return indexArbre;
    }

    public int indexFlor(String color) {
        int indexFlor = -1;
        int i = 0;

        while(indexFlor == -1 && i < llistaFlors.size()) {
            if(llistaFlors.get(i).getColor().equalsIgnoreCase(color)
            ) {
                indexFlor = i;
            }
            i++;
        }

        return indexFlor;
    }
    public int indexDecoracio(String fustaOplastic) {
        int indexDecoracio = -1;
        int i = 0;

        while(indexDecoracio == -1 && i < llistaDecoracions.size()) {
            if(llistaDecoracions.get(i).getFustaOplastic().equalsIgnoreCase(fustaOplastic)
            ) {
                indexDecoracio = i;
            }
            i++;
        }

        return indexDecoracio;
    }


}
