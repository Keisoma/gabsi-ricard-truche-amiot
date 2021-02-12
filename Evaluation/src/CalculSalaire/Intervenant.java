package CalculSalaire;

public abstract class Intervenant {

    protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }



    public abstract double getSalaire();

    public String afficherDonnées() {
        String retour = "";

        if(this instanceof Salarie) {
            retour = (((Salarie) this).toString());
        }
        if (this instanceof Pigiste)
            retour = (((Pigiste) this).toString());

        return retour;
    }
}
