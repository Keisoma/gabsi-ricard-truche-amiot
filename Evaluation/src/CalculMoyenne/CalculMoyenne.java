package CalculMoyenne;

public class CalculMoyenne {

    public CalculMoyenne() {
    }

    private static double[] tableau = new double[0];

    public void addTableau(double add) {

        double[] new_tableau = new double[tableau.length + 1];

        for(int i = 0; i < tableau.length; i++)
            new_tableau[i] = tableau[i];

        new_tableau[new_tableau.length-1] = add;

        this.tableau = new_tableau;

    }

    public double calcul(){

        double total = 0;

        for(int i = 0; i < tableau.length; i++)
            total += tableau[i];

        double resultat = total/tableau.length;

        return resultat;
    }
}
