package Cercle;

public class TestCercle {

    public static void main(String[] args) {


        Cercle cercle1 = new Cercle(2);
        Cercle cercle2 = new Cercle(3);

        System.out.println(cercle1.surface());
        System.out.println(cercle2.surface());
        System.out.println(cercle1.perimetre());
        System.out.println(cercle2.perimetre());
    }
}
