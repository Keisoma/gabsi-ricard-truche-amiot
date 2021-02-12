package JeuDeRole;

public class Loup extends Creature{

    public Loup() {
        super();
        this.pointsDeVie = 5 + (int) (Math.random() *(11-5));
        this.force = 3 + (int) (Math.random() *(9-3));
        this.score = 1;
    }
    @Override
    public String toString() {
        return "Loup : " +
                "\n PV=" + pointsDeVie +
                "\n Force=" + force
                ;
    }
}
