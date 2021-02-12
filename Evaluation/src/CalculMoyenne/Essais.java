package CalculMoyenne;

public class Essais {

    public static void main(String[] args) {

        CalculMoyenne moyenne = new CalculMoyenne();

        moyenne.addTableau(13);
        moyenne.addTableau(15);

        System.out.println(moyenne.calcul());

        moyenne.addTableau(18);
        moyenne.addTableau(9);

        System.out.println(moyenne.calcul());


    }
}
