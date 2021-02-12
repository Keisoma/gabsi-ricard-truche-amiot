package Immobilier;

import java.util.ArrayList;
import java.util.List;

public class Maison {

    public Maison() {
    }

    List<Piece> maison = new ArrayList<>();

    public void ajouterPiece(Piece piece){

        // possible de creer des étages négatif : sous-sols
        // mais pas des superficies négatives car impossibles

        if(piece != null && piece.superficie > 0)
            maison.add(piece);
    }

    public double superficieTotal() {

        double superficieTotal = 0;

        for (Piece i: maison)
            superficieTotal += i.superficie;

        return superficieTotal;
    }

    public double superficiePiece(Piece piece) {

        double superficiePiece = 0;

        for (Piece i: maison)

            if (i.getClass().equals(piece.getClass()) )
                superficiePiece += i.superficie;

        return superficiePiece;
    }

    public int nombrePieces(Piece piece) {

        int nombrePieces = 0;

        for (Piece i: maison)

            if (i.getClass().equals(piece.getClass()) )
                nombrePieces++;

        return nombrePieces;
    }
}
