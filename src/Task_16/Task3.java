package Task_16;

public class Task3 {
    public static void main(String[] args) {
        String line = ")[{Hello ((world}])";
        char[] arrayCh = line.toCharArray();
        int openedParentheses = 0;
        int closedParentheses = 0;
        int openedSquareBrackets = 0;
        int closedSquareBrackets = 0;
        int openedCurlyBrackets = 0;
        int closedCurlyBrackets = 0;
        for (int i = 0; i < arrayCh.length; i++) {
            if (arrayCh[i] == '(') {
                openedParentheses += 1;
            } else if (arrayCh[i] == '[') {
                openedSquareBrackets += 1;
            } else if (arrayCh[i] == '{') {
                openedCurlyBrackets += 1;
            } else if (arrayCh[i] == ')') {
                closedParentheses += 1;
            } else if (arrayCh[i] == ']') {
                closedSquareBrackets += 1;
            } else if (arrayCh[i] == '}') {
                closedCurlyBrackets += 1;
            }
        }
        if (line.indexOf('(') < line.indexOf(')') && openedParentheses == closedParentheses) {
            System.out.println("Correct parentheses");
        } else {
            System.out.println("Incorrect parentheses");
        }
        if (line.indexOf('[') < line.indexOf(']') && openedSquareBrackets == closedSquareBrackets) {
            System.out.println("Correct square brackets");
        } else {
            System.out.println("Incorrect square brackets");
        }
        if (line.indexOf('{') < line.indexOf('}') && openedCurlyBrackets == closedCurlyBrackets) {
            System.out.println("Correct curly brackets");
        } else {
            System.out.println("Incorrect curly brackets");
        }
    }
}
