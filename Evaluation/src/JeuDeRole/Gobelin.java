package JeuDeRole;

public class Gobelin extends Creature{

    public Gobelin() {
        super();
        this.pointsDeVie = 10 + (int) (Math.random() *(16-10));
        this.force = 5 + (int) (Math.random() *(11-5));
        this.score = 2;

    }
    @Override
    public String toString() {
        return "Gobelin : " +
                "\n PV=" + pointsDeVie +
                "\n Force=" + force
                ;
    }

}
