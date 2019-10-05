package lena;


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

    private static final String PLUS = "+";
    private static final String DIVIDE = "/";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";

    public double evaluate(final String expr) {
        if (expr.isEmpty()) {
            return 0;
        }
        //Get array of components
        final String[] components = expr.split(" ");

        // The final result of the input expression is the last number of the helper-stack
        final Stack<Double> helperCalculationStack = new Stack<>();
        for (final String component : components) {
            if (isOperator(component)) {
                //Calculate last two numbers of stack with given operator and push the result to stack
                final double secondNumber = helperCalculationStack.pop();
                final double firstNumber = helperCalculationStack.pop();
                helperCalculationStack.push(getCalculationResult(firstNumber, secondNumber, component));
            } else {
                helperCalculationStack.push(Double.parseDouble(component));
            }
        }
        return helperCalculationStack.pop();
    }


    private static double getCalculationResult(final double firstNumber, final double secondNumber, final String operator) {
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
        return input.equals(PLUS) || input.equals(MINUS) || input.equals(MULTIPLY) || input.equals(DIVIDE);
    }

}
