package JeuDeRole;

public class Dragon extends Creature {

    public Dragon() {
        super();
        this.pointsDeVie = 150000000 + (int) (Math.random() *(800000-5000));
        this.force = 99999999 + (int) (Math.random() *(99999999-9));
        this.score = 99999;

    }
    @Override
    public String toString() {
        return "Dragon : " +
                "\n PV=" + pointsDeVie +
                "\n Force=" + force
                ;
    }

}

