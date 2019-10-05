package lena;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * https://www.codewars.com/kata/52f78966747862fc9a0009ae/train/java
 * Instruction:
 * Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
 * For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
 * For your convenience, the input is formatted such that a space is provided between every token.
 * Empty expression should evaluate to 0.
 * Valid operations are +, -, *, /.
 * You may assume that there won't be exceptional situations (like stack underflow or division by zero).
 */
public class ReversePolishNotation {

    private static final char PLUS = '+';
    private static final char DIVIDE = '/';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';

    public double evaluate(final String expr) {
        if (expr.isEmpty()) return 0;

        //Create Deque of components from input string
        final Queue<String> componentDeque = getComponentDeque(expr);

        // Pop all values of component stack (one after another):
        //      if number: push it to helper stack
        //      else: calculate last two numbers of helper-stack with given operator and push the result to helper-stack
        // The final result of the input expression is the last number of the helper-stack
        final Stack<Double> helperCalculationStack = new Stack<>();
        while (!componentDeque.isEmpty()) {
            String nextComponent = componentDeque.remove();
            if (isOperator(nextComponent)) {
                final double secondNumber = helperCalculationStack.pop();
                final double firstNumber = helperCalculationStack.pop();
                final double calculation = getCalc(firstNumber, secondNumber, nextComponent.charAt(0));
                nextComponent = String.valueOf(calculation);
            }
            helperCalculationStack.push(Double.parseDouble(nextComponent));
        }
        return helperCalculationStack.pop();
    }

    private static Queue<String> getComponentDeque(final String string) {
        final char[] chars = string.toCharArray();
        final Queue<String> deque = new ArrayDeque<>();

        StringBuilder lastString = new StringBuilder();
        for (final char c : chars) {
            if (c != ' ') {
                lastString.append(c);
            } else {
                deque.add(lastString.toString());
                lastString = new StringBuilder();
            }
        }
        if (!lastString.toString().isEmpty()) {
            deque.add(lastString.toString());
        }

        return deque;
    }

    private static double getCalc(final double firstNumber, final double secondNumber, final char operator) {
        switch (operator) {
            case PLUS:
                return firstNumber + secondNumber;
            case MINUS:
                return firstNumber - secondNumber;
            case DIVIDE:
                return firstNumber / secondNumber;
            case MULTIPLY:
                return firstNumber * secondNumber;
            default:
                throw new IllegalArgumentException("Only operators '+' , '-' , '*' and '/' are allowed");
        }
    }

    private static boolean isOperator(final String input) {
        if (input.length() != 1) return false;
        final char inputChar = input.charAt(0);
        return (inputChar == PLUS) || (inputChar == MINUS) || (inputChar == MULTIPLY) || (inputChar == DIVIDE);
    }

}
