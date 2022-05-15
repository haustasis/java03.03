package n1exercici1;

public class Arbre {

    private String tipus;


    private String alzada;
    private double preu;

    public Arbre() {
        tipus = "arbre";
        alzada = "";
        preu = 0;

    }

    public Arbre(String alzada, double preu) {
        tipus = "arbre";
        this.alzada = alzada;
        this.preu = preu;

    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }


    public String getAlzada() {
        return alzada;
    }

    public void setAlzada(String alzada) {
        this.alzada = alzada;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }



    @Override
    public String toString() {
        return "Arbre{" +
                "tipus='" + tipus + '\'' +
                ", alzada=" + alzada +
                ", preu=" + preu +
                '}';
    }
}
