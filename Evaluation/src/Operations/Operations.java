package Operations;

public class Operations {

    public double calcul(double a, double b, char opérateur) {

        if(opérateur == '+') {
            double résultat = a+b;
            System.out.println("Le résultat de " + a + opérateur + b + " est : " + résultat );
            return a+b;
        }

        else if(opérateur == '-') {
            double résultat = a-b;
            System.out.println("Le résultat de " + a + opérateur + b + " est : " + résultat );
            return a-b;
        }

        else if(opérateur == '*') {
            double résultat = a*b;
            System.out.println("Le résultat de " + a + opérateur + b + " est : " + résultat );
            return a*b;
        }

        else if(opérateur == '/') {
            double résultat = a/b;
            System.out.println("Le résultat de " + a + opérateur + b + " est : " + résultat );
            return a/b;
        }

        else {
            System.out.println("L'opérateur ne correspond à aucune opération connu");
            return 0;
        }

    }

}
