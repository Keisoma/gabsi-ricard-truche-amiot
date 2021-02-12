package Theatre;

public class Theatre {

    private String nom;
    private int capaciteMax;
    private int totalInscrit;
    private double recetteTotal;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalInscrit = totalInscrit;
        this.recetteTotal = recetteTotal;
    }

    public void inscrire(int nbClient, double prixPlace){

        if(capaciteMax > totalInscrit){
            totalInscrit += nbClient;
            recetteTotal += nbClient * prixPlace;
        }

        else
            System.out.println("Le theatre est complet");

    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getTotalInscrit() {
        return totalInscrit;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }
}
