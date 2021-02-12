package Formes;

public class AffichageForme {

    public void afficher(Forme forme) {

        System.out.println("Surface : " + forme.calculerSurface() + " & Périmètre : " + forme.calculerPerimetre());

    }

}
