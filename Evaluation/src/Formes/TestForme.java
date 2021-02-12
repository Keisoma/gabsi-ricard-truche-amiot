package Formes;

public class TestForme {

    public static void main(String[] args){

        AffichageForme AF = new AffichageForme();

        Cercle cercle = new Cercle(3);
        AF.afficher(cercle);

        Rectangle rectangle = new Rectangle(5,2);
        AF.afficher(rectangle);

        Carre carre = new Carre(5);
        AF.afficher(carre);

    }

}
