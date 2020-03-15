public class ArrayStack<E> implements Stack<E> {
	private E[] arr = null;
	private int CAP;
	private int top = -1;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public ArrayStack(int cap) {
		this.CAP = cap;
		this.arr = (E[]) new Object[cap];
	}

	public E pop() {
		if(this.size == 0){
			return null;
		}

		this.size--;
		E result = this.arr[top];
		this.arr[top] = null;//prevent memory leaking
		this.top--;

		return result;
	}

	public void push(E elem) {

		this.size++;
		this.arr[++top] = elem;

	}

	public boolean isFull() {
		if (this.size == this.CAP)
			return false;
		return true;
	}

	public String toString() {
		if(this.size==0){
			return null;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}

		sb.setLength(sb.length()-2);
		return sb.toString();
	}
	public boolean isEmpty(){
		if (this.size == this.CAP)
			return true;

		return false;
	}
  public E peek(){
		return arr[top];
	}
  public void clear(){
		for(int top = 0; top<this.size;top++){
			this.arr[top] = null;
		}
	}
  public int size(){
		return size;
	}
  public void reverse(){
		E[] tmp = (E[]) new Object[CAP];
		for(int i=0; i<this.size; i++){
			tmp[i] = arr[(this.size-1)-i];
		}
		arr = tmp;

	}
  public void display(){
		System.out.println(toString());

	}
}
