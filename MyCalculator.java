import java.util.*;


//This calculator assumes that each expression does not contain double digits


public class MyCalculator{

  public static boolean isBalanced(String expression){

    boolean something = true;
    String fh = "({[<";         // fh = first half of braket
    String sh = ")}]>";         // sh = second half of braket
    int count = 0;
    int n2 =0;

    Stack<Character> cal = new ArrayStack<Character>(100);
    Stack<Character> tmp = new ArrayStack<Character>(100);

    for(int a = 0; a < expression.length(); a++) {
      if(expression.charAt(a) != ' ')
          count++;
    }

    for(int i = 0; i<count ;i++){
      for(int j = 0; j<4 ;j++){
        if(expression.charAt(i) == fh.charAt(j) || expression.charAt(i) == sh.charAt(j)){
          cal.push(expression.charAt(i));
          n2++;
        }
      }
    }
    if(cal.isEmpty() == false){
      n2 = n2/2;

      for(int i = 0; i< n2; i++){
        tmp.push(cal.pop());
      }

      for (int j = 0; j< n2; j++){
        if(cal.peek() == fh.charAt(0) && tmp.peek() == sh.charAt(0)){
          cal.pop();
          tmp.pop();
        }
        else if(cal.peek() == fh.charAt(1) && tmp.peek() == sh.charAt(1)){
          cal.pop();
          tmp.pop();
        }
        else if(cal.peek() == fh.charAt(2) && tmp.peek() == sh.charAt(2)){
          cal.pop();
          tmp.pop();
        }
        else if(cal.peek() == fh.charAt(3) && tmp.peek() == sh.charAt(3)){
          cal.pop();
          tmp.pop();
        }
      }

      if(cal.size() != 0 || tmp.size() != 0){
        something = false;
      }
  }
  return something;
}

  public static String infixToPostfix(String infix){

    return "thth";
  }

  public static double evaluate(String postfix){

    String midPostfix = "";
    for(int i = 0; i< postfix.length();i++){
      midPostfix = (midPostfix + postfix.charAt(i) + " ");
    }

    Scanner newPostfix = new Scanner(midPostfix);

        Stack operands = new ArrayStack(100);

        while (newPostfix.hasNext()) {

            if (newPostfix.hasNextDouble()) {
                operands.push(newPostfix.nextDouble());
            }
            else {
                double operand2 = (double) operands.pop();
                double operand1 = (double) operands.pop();
                String operator = newPostfix.next();

                if(operator.equals("+")){
                  operands.push(operand1 + operand2);
                }
                else if(operator.equals("-")){
                  operands.push(operand1 - operand2);
                }
                else if(operator.equals("*")){
                  operands.push(operand1 * operand2);
                }
                else if(operator.equals("/")){
                  operands.push(operand1 / operand2);
                }
                else if(operator.equals("^")){
                  operands.push(Math.pow(operand1, operand2));
                }

            }
        }

        newPostfix.close();
        return (double) operands.pop();
  }

}
