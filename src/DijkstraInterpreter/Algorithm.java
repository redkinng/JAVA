package DijkstraInterpreter;

import java.util.Stack;

public class Algorithm {
    private Stack<String> operatorStack;
    private Stack<Double> valueStack;

    public Algorithm(){
        operatorStack = new Stack<>();
        valueStack = new Stack<>();
    }

    public void interpretExpression(String expression){
        String[] expressionArray = expression.split(" ");

        for(String s: expressionArray){
            if(s.equals("(")){
                // Do nothing
            } else if(s.equals("+")){
                operatorStack.push(s);
            } else if(s.equals("*")){
                operatorStack.push(s);
            } else if(s.equals(")")){
                    String op = operatorStack.pop();
                    if (op.equals("+")){
                        valueStack.push(valueStack.pop() + valueStack.pop());
                    }else if(op.equals("*")){
                        valueStack.push(valueStack.pop() * valueStack.pop());
                    }
            }
            else {
                valueStack.push(Double.parseDouble(s));
            }
        }

    }

    public double result(){
        return valueStack.pop();
    }
}
