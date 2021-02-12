package Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre t = new Theatre("Theatre",10);

        t.inscrire(9,10);
        t.inscrire(1,10);
        t.inscrire(1,10);

        System.out.println("Total clients inscrit : " + t.getTotalInscrit());
        System.out.println("Recette total : " + t.getRecetteTotal());


    }

}
