package DijkstraTwoStackAlgorithm;

public class Main {
    public static void main(String[] args) {
        String equation="(5 + ((4 * 2) * (2 + 3)))";//45
        System.out.println(evaluate(equation));
        System.out.println(evaluate("(4/2)"));//2
        System.out.println(evaluate("(4-6)"));//-2
        System.out.println(evaluate("(5 + 3)"));//8
    }
    public static double evaluate(String exp){
        Stack<Double> numbers=new Stack<>();
        Stack<Character> operators=new Stack<>();
        for(char c:exp.toCharArray()){
            if(c=='*' || c=='+' || c=='-' || c=='/'){
                operators.push(c);
            } else if (c==')') {
                numbers.push(calculate(operators.pop(),numbers.pop(),numbers.pop()));
            } else if(Character.isDigit(c)){
                numbers.push((double)(c - '0'));
            }
        }
        return numbers.pop();
    }
    public static double calculate(char operator,double a,double b){
        switch (operator){
            case '+':
                return a+b;
            case '*':
                return a*b;
            case '-':
                return b-a;
            case '/':
                return b/a;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
