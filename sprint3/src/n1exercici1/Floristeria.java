package n1exercici1;

import java.util.ArrayList;

public class Floristeria {

    // atributs
    private String id;
    private String nom;
    private ArrayList<Arbre> llistaArbres;
    private ArrayList<Flor> llistaFlors;
    private ArrayList<Decoracio> llistaDecoracions;

    // constructor sense parametres
    public Floristeria() {
        id = "";
        nom = "";
        llistaArbres = new ArrayList<>();
        llistaFlors = new ArrayList<>();
        llistaDecoracions = new ArrayList<>();
    }

    // constructor amb parametres
    public Floristeria(String id, String nom) {
        this.id = id;
        this.nom = nom;
        llistaArbres = new ArrayList<>();
        llistaFlors = new ArrayList<>();
        llistaDecoracions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "Floristeria{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", llistaArbres=" + llistaArbres +
                ", llistaFlors=" + llistaFlors +
                ", llistaDecoracions=" + llistaDecoracions +
                '}';
    }


}
