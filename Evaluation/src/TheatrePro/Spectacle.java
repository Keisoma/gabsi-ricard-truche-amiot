package TheatrePro;

public class Spectacle {

    private String nom;
    private TypeSpectacle type;
    private double tarifUnitaire;
    private int capaciteMax;
    private int nbInscrit;

    public Spectacle(String nom, TypeSpectacle type, double tarifUnitaire,int capaciteMax) {
        this.nom = nom;
        this.type = type;
        this.tarifUnitaire = tarifUnitaire;
        this.capaciteMax = capaciteMax;
    }

    public void addClient(int nbClient){
        this.nbInscrit += nbClient;
    }

    public String getNom() {
        return nom;
    }

    public TypeSpectacle getType() {
        return type;
    }

    public double getTarifUnitaire() {
        return tarifUnitaire;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getNbInscrit() {
        return nbInscrit;
    }

    public boolean isComplete(){return nbInscrit >= capaciteMax;}
}
