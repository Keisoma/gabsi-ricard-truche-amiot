package JeuDeRole;

import java.util.Scanner;

public class JeuDeRole {
    static Scanner saisie = new Scanner(System.in);
    static Personnage p1 = null;
    static Creature c1;

    public static void main(String[] args) throws InterruptedException {
        int selection;
        do {
            Thread.sleep(1000);
            do {
                System.out.println("\nMenu du jeu : \n 1 - Créer un nouveau personnage \n 2 - Consulter les stats du personnage actuel \n 3 - Combattre \n 4 - Afficher le score du personnage actuel \n 5 - Sortir du jeu");

                selection = saisie.nextInt();

                switch (selection) {
                    case (1) -> {
                        créerPersonnage();
                        System.out.println("Personnage créé !");
                        System.out.println(p1.toString() + "\n");
                    }
                    case (2) -> System.out.println(p1.toString() + "\n");
                    case (3) -> {
                        if (p1 != null && p1.getPointsDeVie() !=0) Combattre();
                        else {
                            System.out.println("Veuillez d'abord créer un personnage.");
                        }
                    }
                    case (4) -> System.out.println("Score du personnage : " + p1.getScore());
                    case (5) -> {
                        System.out.println("Vous quittez le jeu");
                        System.exit(0);
                    }
                    default -> System.out.println("Saisie invalide");

                }
            } while (selection < 1 || selection > 3);
        } while (true);

    }

    public static void créerPersonnage() {
        p1 = new Personnage();
    }

    public static void Combattre() throws InterruptedException {
        int ennemi;
        do {
            Thread.sleep(1000);
            System.out.println("Type d'ennemi à combattre :  \n 1 - Loup \n 2 - Gobelin \n 3 - Troll \n 4 - Dragon (A vos risques et périls)");
            ennemi = saisie.nextInt();

            switch (ennemi) {
                case (1) -> {
                    c1 = new Loup();
                    System.out.println(c1.toString());
                }
                case (2) -> {
                    c1 = new Gobelin();
                    System.out.println(c1.toString());
                }
                case (3) -> {
                    c1 = new Troll();
                    System.out.println(c1.toString());
                }
                case (4) -> {
                    c1 = new Dragon();
                    System.out.println(c1.toString());
                    System.out.println("\nVous avez pris une mauvaise décision.\n");
                    Thread.sleep(3000);
                }
                default -> System.out.println("Saisie invalide");
            }
        } while (ennemi < 1 || ennemi > 4);


        int compteur = 1;
        do {
            System.out.println("\n \nTour " + compteur);

            System.out.println(" \nJoueur : PV = " + p1.getPointsDeVie() + " , Force = " + p1.getForce());
            System.out.println("Ennemi : PV = " + c1.getPointsDeVie() + " , Force = " + c1.getForce());

            int attaqueJoueur = p1.getForce() + (int) (Math.random() * (11 - 1));
            int attaqueEnnemi = c1.getForce() + (int) (Math.random() * (11 - 1));

            System.out.println("\nRoll attaque joueur : " + attaqueJoueur);
            System.out.println("Roll attaque ennemi : " + attaqueEnnemi);

            int resultatTour = attaqueJoueur - attaqueEnnemi;
            if (resultatTour >= 0) {
                c1.setPointsDeVie(c1.getPointsDeVie() - resultatTour);
                System.out.println("\nVous infligez " + resultatTour + " point(s) de dégâts à l'ennemi.");
                if (c1.getPointsDeVie() <= 0) {
                    c1.setPointsDeVie(0);
                    System.out.println("L'ennemi est mort, vous avez gagné " + c1.getScore() + " point(s).");
                    p1.setScore(p1.getScore() + c1.getScore());
                }


            } else {
                p1.setPointsDeVie((p1.getPointsDeVie()) + resultatTour);
                System.out.println("\nL'ennemi vous inflige " + -resultatTour + " point(s) de dégâts.");

                if (p1.getPointsDeVie() <= 0) {
                    p1.setPointsDeVie(0);
                    System.out.println("Votre personnage est décédé. Il a obtenu le score de " + p1.getScore() + " point(s).");
                }
            }

            compteur++;
            Thread.sleep(1000);
        } while (c1.getPointsDeVie() > 0 && p1.getPointsDeVie() > 0);

    }


}


