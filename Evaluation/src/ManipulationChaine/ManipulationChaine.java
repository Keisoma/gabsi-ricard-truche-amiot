package ManipulationChaine;

import java.util.Locale;

public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        System.out.println("Taille de la chaine : " + chaine.length());

        System.out.println("Position du premier ; " + chaine.indexOf(';'));

        String nomDeFamille = chaine.substring(chaine.indexOf("D"), chaine.indexOf(";"));

        System.out.println(nomDeFamille);
        System.out.println(nomDeFamille.toUpperCase());
        System.out.println(nomDeFamille.toLowerCase());

        String split[] = chaine.split(";");
        for (String s : split) {
            System.out.println(s);
        }

        split[2]=split[2].replace(" ", "");
        System.out.println(split[2]);

        Salarie s1 = new Salarie(split[0], split[1], Double.parseDouble(split[2]));
        System.out.println(s1.toString());
    }
}
