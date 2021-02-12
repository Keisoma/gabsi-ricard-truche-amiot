package Parseur;

import java.util.regex.Pattern;

public class Parser {

    public static Expression parse(String expression){

        String[] operateurs = {"+","/","*","-"};


        for(String op : operateurs){
            if(expression.contains(op)){

                String[] cutExpression = expression.split(Pattern.quote(op));

                return new Expression(cutExpression[0],cutExpression[1],op);

            }
        }
        return null;


    }

}
