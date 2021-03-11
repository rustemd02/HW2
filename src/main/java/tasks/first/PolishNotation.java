package tasks.first;

import java.util.ArrayDeque;

public class PolishNotation {
    public static void main(String[] args) {
        PolishNotation polishNotation = new PolishNotation();
        System.out.println(polishNotation.reverseCalculator("45 4 -"));
    }


    public Long reverseCalculator(String s) throws IllegalArgumentException {
        ArrayDeque<Long> arrayDeque = new ArrayDeque<>();
        String[] str = s.split(" ");
        long result = 0;
        for (int i = 0; i < str.length; i++) {
            result = 0;
            if (!str[i].equals("+") & !str[i].equals("-") & !str[i].equals("*") & !str[i].equals("/")) {
                arrayDeque.push(Long.valueOf(str[i]));
            } else {
                switch (str[i]) {
                    case "+":
                        result += arrayDeque.removeFirst() + arrayDeque.removeFirst();
                        arrayDeque.push(result);
                        break;
                    case "-":
                        result += -arrayDeque.removeFirst() + arrayDeque.removeFirst();
                        arrayDeque.push(result);
                        break;
                    case "*":
                        result += arrayDeque.removeFirst() * arrayDeque.removeFirst();
                        arrayDeque.push(result);
                        break;
                    case "/":
                        long ph = arrayDeque.removeFirst();
                        result += arrayDeque.removeFirst() / ph;
                        arrayDeque.push(result);
                        break;
                }
            }

        }

        return result;
    }

}
