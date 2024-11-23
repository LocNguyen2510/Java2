package Stack_Linked_List;

public class LinkedStack<T> implements StackADT<T> {
	private int count;
	private LinkedNode<T> top;

	public LinkedStack() {
		count = 0;
		top = null;
		count++;
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		LinkedNode<T> temp = new LinkedNode<>(element, top);
		top = temp;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
