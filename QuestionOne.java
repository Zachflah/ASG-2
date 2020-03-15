public class QuestionOne{

  public static void main(String[] args){

    Stack<Integer> stack = new ArrayStack<>(20);
    ListStack<Integer> list = new ListStack(20);


    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    stack.push(10);
    stack.push(11);
    stack.push(12);
    stack.push(13);
    stack.push(14);
    stack.push(15);
    stack.push(16);
    stack.push(17);
    stack.push(8);
    stack.push(19);
    stack.push(20);

    list.push(20);
    list.push(19);
    list.push(18);
    list.push(17);
    list.push(16);
    list.push(15);
    list.push(14);
    list.push(13);
    list.push(12);
    list.push(11);
    list.push(10);
    list.push(9);
    list.push(8);
    list.push(7);
    list.push(6);
    list.push(5);
    list.push(4);
    list.push(3);
    list.push(2);
    list.push(1);

    stack.display();
    list.display();
    stack.reverse();
    list.reverse();
    stack.display();
    list.display();
    System.out.println(stack.peek());
    list.peek();
    System.out.println(stack.pop());
    list.pop();
    stack.pop();
    list.pop();
    stack.reverse();
    list.reverse();
    System.out.println(stack.size());
    list.size();
    System.out.println(stack.isFull());
    list.isFull();
    System.out.println(stack.isEmpty());
    list.isEmpty();
    stack.display();
    list.display();
    stack.clear();
    list.clear();
    stack.clear();
    list.clear();
    stack.display();
    list.display();
    stack.isEmpty();
    list.isEmpty();

    stack.push(1);
    stack.display();
  }
}
