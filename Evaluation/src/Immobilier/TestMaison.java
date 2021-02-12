package Immobilier;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();


        Chambre chambre1 = new Chambre(12, 0);
        Chambre chambre2 = new Chambre(22, 1);
        Chambre chambre3 = new Chambre(18, 1);
        Cuisine cuisine = new Cuisine(42, 0);
        Salon salon = new Salon(59, 0);
        WC WC2 = new WC(5, 0);
        WC WC1 = new WC(7, 1);
        SalleDeBain salleDeBain1 = new SalleDeBain(12, 0);
        SalleDeBain salleDeBain2 = new SalleDeBain(16, 1);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(chambre3);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(WC1);
        maison.ajouterPiece(WC2);
        maison.ajouterPiece(salleDeBain1);
        maison.ajouterPiece(salleDeBain2);


        Salon salon2 = new Salon(-39, -1); // possible de creer des étages négatif : sous-sols

        maison.ajouterPiece(null);
        maison.ajouterPiece(salon2);

        System.out.println(maison.superficieTotal());

        System.out.println(maison.superficiePiece(chambre1));

        System.out.println(maison.nombrePieces(chambre1));

    }
}
