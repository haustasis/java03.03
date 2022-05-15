package n1exercici1;

public class Flor {

    private String tipus;
    private String id;
    private String nom;
    private String color;
    private double preuCost;
    private double preuVenda;

    public Flor() {
        tipus = "";
        id = "";
        nom = "";
        color = "";
        preuCost = 0;
        preuVenda = 0;
    }

    public Flor(String tipus, String id, String nom, String color, double preuCost, double preuVenda) {
        this.tipus = tipus;
        this.id = id;
        this.nom = nom;
        this.color = color;
        this.preuCost = preuCost;
        this.preuVenda = preuVenda;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPreuCost() {
        return preuCost;
    }

    public void setPreuCost(double preuCost) {
        this.preuCost = preuCost;
    }

    public double getPreuVenda() {
        return preuVenda;
    }

    public void setPreuVenda(double preuVenda) {
        this.preuVenda = preuVenda;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "tipus='" + tipus + '\'' +
                ", id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", color=" + color +
                ", preuCost=" + preuCost +
                ", preuVenda=" + preuVenda +
                '}';
    }
}
