package JeuDeRole;

public abstract class Creature {

    protected int pointsDeVie;
    protected int force;
    protected int score;


    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
