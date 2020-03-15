public interface Stack<E>{

  public abstract boolean isEmpty();
  public abstract boolean isFull();
  public abstract E peek();
  public abstract E pop();
  public abstract void push(E elem);
  public abstract void clear();
  public abstract int size();
  public abstract void reverse();
  public abstract String toString();
  public abstract void display();
}
