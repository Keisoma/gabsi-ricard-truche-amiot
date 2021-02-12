package Parseur;

public class Expression {

    private String membreGauche;
    private String membreDroit;
    private String operateur;

    public Expression(String membreGauche, String membreDroit, String operateur) {
        this.membreGauche = membreGauche;
        this.membreDroit = membreDroit;
        this.operateur = operateur;
    }

    public double evaluer(String variable, double value){
        double leftNumber;
        double rightNumber;

        String parsedLeft = membreGauche.replace(variable,"" + value);
        String parsedRight = membreDroit.replace(variable,"" + value);

        try{
            leftNumber = Double.parseDouble(parsedLeft);
            rightNumber = Double.parseDouble(parsedRight);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }

        double result = 0;

        if(operateur.equals("+"))
            result = leftNumber + rightNumber;
        if(operateur.equals("-"))
            result = leftNumber - rightNumber;
        if(operateur.equals("*"))
            result = leftNumber * rightNumber;
        if(operateur.equals("/"))
            result = leftNumber / rightNumber;
        return  result;

    }

    @Override
    public String toString() {
        return "Expression{" +
                "membreGauche='" + membreGauche + '\'' +
                ", membreDroit='" + membreDroit + '\'' +
                ", operateur='" + operateur + '\'' +
                '}';
    }
}
