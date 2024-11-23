package Stack_Linked_List;

import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T> {
	private int count;
	private LinkedNode<T> top;

	public LinkedStack() {
		count = 0;
		top = null;

	}

	@Override
	public void push(T element) {
		LinkedNode<T> temp = new LinkedNode<>(element, top);
		top = temp;
		count++;
	}

	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T result = top.getData(); // lấy ra giá trị của top node
		top = top.getNext();
		count--;
		return result;
	}

	@Override
	public T peek() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.getData();
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

}
