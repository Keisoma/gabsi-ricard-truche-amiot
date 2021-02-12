package Parseur;

public class TestParseur {

    public static void main(String[] args) {
        Expression e = Parser.parse("y/3");

        System.out.print(e.evaluer("y",12));
    }
}
