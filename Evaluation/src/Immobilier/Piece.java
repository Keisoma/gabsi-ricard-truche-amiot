package Immobilier;

public abstract class Piece {

    double superficie;
    int numEtage;

    public Piece() {
    }

    public Piece(double superficie, int numEtage) {
        this.superficie = superficie;
        this.numEtage = numEtage;
    }
}
