package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    private GenerateParenthesis() {
    }

    /**
     * The idea is to add a closing parenthesis ')' only after a valid '('.
     * We need to keep track of the number of opening and closing brackets we have placed so far.
     *
     * @param n number of pairs.
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> generatedParenthesis = new ArrayList<>();

        recurse(generatedParenthesis, new StringBuilder(), 0, 0, n);

        return generatedParenthesis;
    }

    private static void recurse(List<String> ans, StringBuilder cur, int openedParenthesis, int closedParenthesis, int max) {
        //If we have no more parenthesis to add.
        if (cur.length() == max*2){
            ans.add(cur.toString());
            return;
        }
        //If we can add opening parenthesis.
        if (openedParenthesis < max ){
            cur.append("(");
            recurse(ans, cur, openedParenthesis+1, closedParenthesis, max);
            cur.deleteCharAt(cur.length()-1);
        }
        //If we can add closing parenthesis.
        if (closedParenthesis < openedParenthesis){
            cur.append(")");
            recurse(ans, cur, openedParenthesis, closedParenthesis+1, max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
