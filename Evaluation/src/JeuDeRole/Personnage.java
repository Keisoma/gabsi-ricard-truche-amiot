package JeuDeRole;

public class Personnage {

    private int pointsDeVie;
    private int force;
    private int Score;

    public Personnage() {
        this.pointsDeVie = 20 + (int) (Math.random() *(51-20));
        this.force = 12 + (int) (Math.random() * (19-12));
        Score = 0 ;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Personnage :" +
                "\n PV=" + pointsDeVie +
                "\n Force=" + force +
                "\n Score=" + Score
                ;
    }
}
