package tasks.first;

import java.util.ArrayDeque;

public class Brackets {

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.checkBrackets("(d(fsf[dsasd]))"));
    }

    public boolean checkBrackets(String s) {
        if (s == null) {
            return false;
        }
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    brackets.push('(');
                    break;
                case '{':
                    brackets.push('{');
                    break;
                case '[':
                    brackets.push('[');
                    break;
                case ')':
                    if (brackets.getFirst() == '(') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (brackets.getFirst() == '{') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (brackets.getFirst() == '[') {
                        brackets.removeFirst();
                    } else {
                        return false;
                    }
                    break;

            }

        }
        return brackets.isEmpty();
    }

}
