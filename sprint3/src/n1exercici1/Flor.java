package n1exercici1;

public class Flor {

    private String tipus;

    private String color;
    private double preu;


    public Flor() {
        tipus = "flor";
        color = "";
        preu= 0;

    }

    public Flor(String color, double preu) {
        tipus = "flor";
        this.color = color;
        this.preu = preu;

    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }



    @Override
    public String toString() {
        return "Flor{" +
                "tipus='" + tipus + '\'' +
                ", color='" + color + '\'' +
                ", preu=" + preu +
                '}';
    }
}
