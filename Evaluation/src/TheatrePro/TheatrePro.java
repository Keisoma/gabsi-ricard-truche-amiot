package TheatrePro;

import java.util.ArrayList;

public class TheatrePro {

    private String nom;
    private double recetteTotal;
    ArrayList<Spectacle> spectacles = new ArrayList<Spectacle>();

    public TheatrePro(String nom) {
        this.nom = nom;
    }

    public void ajouterSpectacle(Spectacle spectacle){
        this.spectacles.add(spectacle);
    }

    public void inscrire(int nbClient, String nomSpectacle){

        Spectacle spectacle = getSpectacle(nomSpectacle);

        if(spectacle != null)
            if(!spectacle.isComplete()){
                spectacle.addClient(nbClient);
                this.recetteTotal += nbClient * spectacle.getTarifUnitaire();
            }
            else
                System.out.println("Le spectacle est complet");
        else
            System.out.println("Le spectacle n'existe pas");

    }

    public String getNom() {
        return nom;
    }

    public int getNbTotalClients(){
        int total = 0;

        for(Spectacle s : spectacles)
            total += s.getNbInscrit();

        return total;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

    public double getRecetteGlobal(){
       double total = 0;

        for(Spectacle spectacle : spectacles)
            total += spectacle.getTarifUnitaire() * spectacle.getCapaciteMax();

        return total;
    }

    public Spectacle getSpectacle(String nomSpectacle){
        for(Spectacle s : spectacles)
            if(s.getNom().equals(nomSpectacle))
                return s;

        return null;
    }
}
