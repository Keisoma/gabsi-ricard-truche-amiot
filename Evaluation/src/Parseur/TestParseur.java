package Parseur;

public class TestParseur {

    public static void main(String[] args) {
        Expression e = Parser.parse("y/3");

        System.out.print("y/3 avec y= 12 est égale à " + e.evaluer("y",12));
    }
}
