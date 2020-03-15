import java.util.*;

public class ListStack<E> implements Stack<E>{

  private ArrayList<E> list;
  private int n;

  public ListStack(int n){
    list = new ArrayList<>(n);
    this.n = n;
  }
  public boolean isEmpty(){
    return list.isEmpty();
  }
  public boolean isFull(){
    return list.size() == n;
  }
  public E peek(){
    if(list.size() == 0){
      return null;
    }
    else{
      return list.get(size()-1);
    }
  }
  public E pop(){
    if(list.size() == 0){
      return null;
    }
    else{
      return list.remove(size()-1);
    }
  }
  public void push(E elem){
    if(!isFull()){
      list.add(elem);
    }
  }
  public void clear(){
    list.clear();
  }
  public int size(){
    return list.size();
  }
  public void reverse() {
    if(isEmpty()){
      return;
    }
    ListStack<E> temp = new ListStack<>(n);
    while(!isEmpty()){
      temp.push(pop());
    }
    for(int i = 0 ; i < temp.size(); i++)
      push((E)temp.list.get(i));
    }

    public void display() {
      if(isEmpty()){
        System.out.println("stack is empty");
        return;
      }
      for(int i = size()-1; i >= 0 ; i--){
        System.out.println(list.get(i).toString());
        System.out.println();
      }
    }
  }
