package CercleFactory;

public class TestCercle {

    public static void main(String[] args) {


        Cercle cercle1 = CercleFactory.creerCercle(2);
        Cercle cercle2 = CercleFactory.creerCercle(3);

        System.out.println(cercle1.surface());
        System.out.println(cercle2.surface());
        System.out.println(cercle1.perimetre());
        System.out.println(cercle2.perimetre());
    }
}
