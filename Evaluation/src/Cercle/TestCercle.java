package Cercle;

public class TestCercle {

    public static void main(String[] args) {


        Cercle cercle1 = new Cercle(2);
        Cercle cercle2 = new Cercle(3);

        System.out.println("Surface du cercle 1 : " + cercle1.surface());
        System.out.println("Périmètre du cercle 1 : " + cercle1.perimetre());
        System.out.println("Surface du cercle 2 : " + cercle2.surface());
        System.out.println("Perimètre du cercle 2 : " + cercle2.perimetre());
    }
}
