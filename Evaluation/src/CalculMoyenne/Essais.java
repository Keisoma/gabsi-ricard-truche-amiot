package CalculMoyenne;

public class Essais {

    public static void main(String[] args) {

        CalculMoyenne moyenne1 = new CalculMoyenne();
        CalculMoyenne moyenne2 = new CalculMoyenne();

        moyenne1.addTableau(13);
        moyenne1.addTableau(15);

        System.out.println("Moyenne Premier trimestre : " + moyenne1.calcul());

        moyenne2.addTableau(18);
        moyenne2.addTableau(9);

        System.out.println("Moyenne Deuxième trimestre : " + moyenne2.calcul());


    }
}
