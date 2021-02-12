package Formes;

public class Rectangle extends Forme {

    private double longueur, largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {

    }

    @Override
    public double calculerSurface() {
        return longueur*largeur;
    }

    @Override
    public double calculerPerimetre() {
        return longueur*2 + largeur*2;
    }
}
