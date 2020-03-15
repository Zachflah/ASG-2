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

    

    Stack<Character> num = new ArrayStack<Character>(100);
    Stack<Character> operand = new ArrayStack<Character>(100);
    Stack<Character> tmp = new ArrayStack<Character>(100);
    Stack<Character> fin = new ArrayStack<Character>(100);

    String fh = "({[<";         // fh = first half of braket
    String sh = ")}]>";         // sh = second half of braket
    String nu = "123456789";    // nu = numbers from 1 to 9
    String ex = "+-*/";         // ex = expressions

    String temp = "";

    System.out.println("infix:");
    System.out.println(infix);
    System.out.println("postfix:");

    if(isBalanced(infix) == true){
      for(int i = 0; i<infix.length();i++){
        for(int j = 0; j<4;j++){
          if(infix.charAt(i) == fh.charAt(j) || infix.charAt(i) == sh.charAt(j) || infix.charAt(i) == ex.charAt(j)){
            operand.push(infix.charAt(i));
            j = 3;
          }
        }
        for(int k = 0;k<9;k++){
          if(infix.charAt(i) == nu.charAt(k)){
            num.push(infix.charAt(i));
          }
        }
      }
      num.reverse();
      operand.reverse();

      fin.push(num.pop());

      }
      else{
        System.out.println("The String is not balanced");
      }

      tmp.push(operand.pop());
      System.out.println(tmp);


      System.out.println(num);
      System.out.println(operand);
      System.out.println(fin);









    Stack<Character> cal = new ArrayStack<Character>(100);

    StringBuffer newString = new StringBuffer();
    StringBuffer tmpString = new StringBuffer();

    char tmp1;                  // tmp1 = temporary character before transforming it to a String
    String tmp2 = "";           // tmp = temporary string which will contain only 1 char at at time
    char tmp3;
    String tm = " ";
    */
    /*
    if(isBalanced(infix) == true){
      for(int i = 0; i<infix.length();i++){

        tmp = infix.charAt(i);
        tm= String.valueOf(tmp);

        for(int k = 0; k<9;k++){
          if(tm.charAt(0) == nu.charAt(k)){
            cal.push(tmp);
          }
        }

        System.out.println(cal);
        System.out.println(tm);
        System.out.println("hey");

        int a = i;
        tmp = infix.charAt(a);
        String t = String.valueOf(tmp);

        for(int k = 0 ;k<4;k++){
          if(tm.charAt(0) == ex.charAt(k)){
            System.out.println(tm);
            System.out.println(ex.charAt(k));

/////works until here

            for(int j = 0;j<4;j++){
              System.out.println(t.charAt(a));
              if(t.charAt(a) == fh.charAt(k)){
                tmpString.append(t);
                i++;
              }
              else{
                cal.push(tmp);
              }
            }
          }
        }

        for(int k = 0; k<4;k++){
          if(tm.charAt(0) == sh.charAt(k)){
            cal.push(tmpString.charAt(0));
          }
        }
/*
      if (Number.isInteger(infix.charAt(i))){
        for(int a = 0; a< 9;a++){
          if(infix.charAt(i) == nu.charAt(a)){
            cal.push(infix.charAt(i));
          }
        }
      }

        System.out.println(cal);

        if(infix.charAt(i) == fh.charAt(0) || infix.charAt(i) == fh.charAt(1) ||infix.charAt(i) == fh.charAt(2) || infix.charAt(i) == fh.charAt(3)){
          i++;
          while(infix.charAt(i) != sh.charAt(0) || infix.charAt(i) != sh.charAt(1) || infix.charAt(i) != sh.charAt(2) ||infix.charAt(i) != sh.charAt(3)){
            cal.push(infix.charAt(i));
            i++;
            System.out.println(cal);
          }

        }



/*
        for(int c = 0; c< 4;c++){
          if(infix.charAt(i) == fh.charAt(c)){
            i++;
            while(infix.charAt(i) != sh.charAt(0) || infix.charAt(i) != sh.charAt(1) || infix.charAt(i) != sh.charAt(2) ||infix.charAt(i) != sh.charAt(3)){
              cal.push(infix.charAt(i));
              System.out.println(cal);
            }
            cal.push(tmp2.charAt(0));
          }
        }
        */

        System.out.println("hey");
/*
        for(int b = 0; b< 4;b++){
          if(infix.charAt(i) == ex.charAt(b) && infix.charAt(i+1) != fh.charAt(0) || infix.charAt(i+1) != fh.charAt(1) || infix.charAt(i+1) != fh.charAt(2) || infix.charAt(i+1) != fh.charAt(3)) {
            cal.push(infix.charAt(i));
          }
          else if(infix.charAt(i) == ex.charAt(b) && infix.charAt(i+1) == fh.charAt(0) || infix.charAt(i+1) == fh.charAt(1) || infix.charAt(i+1) == fh.charAt(2) || infix.charAt(i+1) == fh.charAt(3)) {
            tmp1 = infix.charAt(i);
            tmp2 = String.valueOf(tmp1);
          }

          }
          */
          /*
       }
       cal.reverse();

       for(int v = 0; v < cal.size(); v++){
         tmp1 = cal.pop();
         tmp2= String.valueOf(tmp1);
         newString.append(tmp2);
       }
     }
     else{
      newString.append("The value inputed into the string are not balanced");

    }
    */
    return newString.toString();
  }

  public static double evaluate(String postfix){
    double sum=0;
    return sum;
  }
  /*
  public static String infix(String inf){

    String result = "";
        Stack<Character> stack = new ArrayStack<>(100);
        for (int i = 0; i <inf.length() ; i++) {
            char c = inf.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor (
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }
    /*
    int i;
    Stack<Character> cal = new ArrayStack<Character>(100);
    char tmp;
    String output = "";
    for(i = 0; i<inf.length();i++ ){
      tmp = inf.charAt(i);

      if(Character.isLetterOrDigit(tmp)){
        output = output + tmp;
      }
      else if(tmp == "("){
        cal.push(tmp);
      }
      else if(tmp == ")"){
        while(!cal.isEmpty() && cal.peek() != "("){
          output= output + cal.pop();
        }
        if(cal.isEmpty()){
          return "expression not valid";
        }
        else{
          cal.pop();
        }
      }
      else{
        while(!cal.isEmpty()){
          output = output + cal.pop();
        }
        cal.push(tmp);
      }
      while(!cal.isEmpty()){
        output = output + cal.pop();
      }
      return output;
    }
  public static int precedence(char c){
    switch (c){
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
    }
    return -1;
}
*/
}
