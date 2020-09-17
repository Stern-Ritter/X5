package ru.x5.hw5.Task1;

import ru.x5.hw5.Task1.Logger.Logger;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
    private Logger logger;
    private final String OPERATORS = "+-/*";
    private final String OPENBRACKET = "(";
    private final String CLOSEBRACKET = ")";

    public Calculator (Logger logger){
        this.logger = logger;
    }

    private boolean isOperator(String sub) {
        return OPERATORS.contains(sub);
    }

    private int operatorPriority(String sub) {
        switch (sub) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }
    }

    private void countUp(Stack<Double> operands, String operator) {
        double secondNum = operands.pop();
        double firstNum = operands.pop();
        switch (operator) {
            case "+":
                operands.add(firstNum + secondNum);
                break;
            case "-":
                operands.add(firstNum - secondNum);
                break;
            case "*":
                operands.add(firstNum * secondNum);
                break;
            case "/":
                operands.add(firstNum / secondNum);
                break;
        }
    }

    public void calculate(String s) {
        Stack<Double> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        s = s.replaceAll("\\s", "");
        StringTokenizer str = new StringTokenizer(s, OPERATORS + OPENBRACKET + CLOSEBRACKET, true);

        while (str.hasMoreTokens()) {
            String tempStr = str.nextToken();
            if (tempStr.equals(OPENBRACKET)) {
                operators.push(tempStr);
            } else if (tempStr.equals(CLOSEBRACKET)) {
                while(!operators.peek().equals(OPENBRACKET)) {
                    countUp(operands, operators.pop());
                }
                operators.pop();
            } else if (isOperator(tempStr)) {
                while(!operators.isEmpty() && operatorPriority(operators.peek()) >= operatorPriority(tempStr)) {
                    countUp(operands, operators.pop());
                }
                operators.push(tempStr);

            } else {
                operands.push(Double.parseDouble(tempStr));
            }
        }

        while(!operators.isEmpty()){
            countUp(operands,operators.pop());
        }

        logger.log("Ответ: " + operands.pop());
    }
}