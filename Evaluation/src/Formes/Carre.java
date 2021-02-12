package Formes;

public class Carre extends Rectangle {

    private double longueur;

    public Carre(double longueur) {
        super();
        this.longueur = longueur;
    }

    @Override
    public double calculerSurface() {
        return Math.pow(longueur, 2);
    }

    @Override
    public double calculerPerimetre() {
        return longueur*2 + longueur*2;
    }
}
