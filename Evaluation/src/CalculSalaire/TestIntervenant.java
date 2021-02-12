package CalculSalaire;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie s1 = new Salarie("Pichon", "Jean", 2000);
        System.out.println(s1.afficherDonnées());
        Pigiste p1= new Pigiste("Poisson", "Jeanne", 15, 850);
        System.out.println(p1.afficherDonnées());


    }
}
