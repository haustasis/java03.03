package n1exercici1;

public class Decoracio {

    private String tipus;
    private String id;
    private String nom;
    private String fustaOplastic;
    private double preuCost;
    private double preuVenda;

    public Decoracio() {
        tipus = "";
        id = "";
        nom = "";
        fustaOplastic = "";
        preuCost = 0;
        preuVenda = 0;
    }

    public Decoracio(String tipus, String id, String nom, String fustaOplastic, double preuCost, double preuVenda) {
        this.tipus = tipus;
        this.id = id;
        this.nom = nom;
        this.fustaOplastic = fustaOplastic;
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

    public String getFustaOplastic() {
        return fustaOplastic;
    }

    public void setFustaOplastic(String fustaOplastic) {
        this.fustaOplastic = fustaOplastic;
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
        return "Decoracio{" +
                "tipus='" + tipus + '\'' +
                ", id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", fustaOplastic='" + fustaOplastic + '\'' +
                ", preuCost=" + preuCost +
                ", preuVenda=" + preuVenda +
                '}';
    }
}
