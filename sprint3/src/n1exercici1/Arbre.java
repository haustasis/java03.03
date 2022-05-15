package n1exercici1;

public class Arbre {

    private String tipus;

    private String nom;
    private double alzada;
    private double preuCost;
    private double preuVenda;

    public Arbre() {
        tipus = "";
        nom = "";
        alzada = 0;
        preuCost = 0;
        preuVenda = 0;
    }

    public Arbre(String tipus, String nom, double alzada, double preuCost, double preuVenda) {
        this.tipus = tipus;
        this.nom = nom;
        this.alzada = alzada;
        this.preuCost = preuCost;
        this.preuVenda = preuVenda;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAlzada() {
        return alzada;
    }

    public void setAlzada(double alzada) {
        this.alzada = alzada;
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
        return "Arbre{" +
                "tipus='" + tipus + '\'' +
                ", nom='" + nom + '\'' +
                ", alzada=" + alzada +
                ", preuCost=" + preuCost +
                ", preuVenda=" + preuVenda +
                '}';
    }
}
