package n1exercici1;

import java.util.ArrayList;

public class Ticket<T> {

    private String id;
    private ArrayList<T> llistaProductes;

    // constructor sense parametres
    public Ticket() {
        id = "";
        llistaProductes = new ArrayList<>();
    }

    // constructor amb parametres
    public Ticket(String id) {
        this.id = id;
        this.llistaProductes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<T> getLlistaProductes() {
        return llistaProductes;
    }

    public void setLlistaProductes(ArrayList<T> llistaProductes) {
        this.llistaProductes = llistaProductes;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", llistaProductes=" + llistaProductes +
                '}';
    }
}
