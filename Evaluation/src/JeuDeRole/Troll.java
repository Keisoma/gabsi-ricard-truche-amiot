package JeuDeRole;

public class Troll extends Creature{
    public Troll() {
        super();
        this.pointsDeVie = 20 + (int) (Math.random() *(31-20));
        this.force = 10 + (int) (Math.random() *(16-10));
        this.score = 5;
    }

    @Override
    public String toString() {
        return "Troll : " +
                "\n PV=" + pointsDeVie +
                "\n Force=" + force
                ;
    }
}
