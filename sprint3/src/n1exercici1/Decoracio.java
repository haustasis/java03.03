package n1exercici1;

public class Decoracio {

    private String tipus;

    private String fustaOplastic;
    private double preu;

    public Decoracio() {
        tipus = "decoracio";
        fustaOplastic = "";
        preu = 0;

    }

    public Decoracio(String fustaOplastic, double preu) {
        tipus = "decoracio";
        this.fustaOplastic = fustaOplastic;
        this.preu = preu;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }



    public String getFustaOplastic() {
        return fustaOplastic;
    }

    public void setFustaOplastic(String fustaOplastic) {
        this.fustaOplastic = fustaOplastic;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }



    @Override
    public String toString() {
        return "Decoracio{" +
                "tipus='" + tipus + '\'' +
                ", fustaOplastic='" + fustaOplastic + '\'' +
                ", preu=" + preu +
                '}';
    }
}
