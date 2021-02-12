package TheatrePro;

public class TestTheatrePro {

    public static void main(String[] args) {

        TheatrePro theatre = new TheatrePro("Theatre");

        theatre.ajouterSpectacle(new Spectacle("Concert",TypeSpectacle.CONCERT,10,10));
        theatre.ajouterSpectacle(new Spectacle("Comedie",TypeSpectacle.COMEDIE,10,10));
        theatre.ajouterSpectacle(new Spectacle("Danse",TypeSpectacle.DANSE,15,10));
        theatre.ajouterSpectacle(new Spectacle("Improv",TypeSpectacle.IMPROVISATION,20,10));

        theatre.inscrire(1,"Concert");
        theatre.inscrire(1,"Comedie");
        theatre.inscrire(1,"Danse");
        theatre.inscrire(1,"Improv");


        System.out.println("La recette global est : " + theatre.getRecetteGlobal());

        System.out.println("La recette totale est : " + theatre.getRecetteTotal());


    }

}
