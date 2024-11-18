package Stack_Array;

public class ArrayStack<T> implements StackADT<T> {
//	top:Biết số lượng phần tử trong stack cũng như vị trí tiếp theo
	private int top;
//Mảng chứa các phần tử được đưa vào stack
	private T[] stack;
//kích thước mặc định của mảng
	private final int DEAFAULT_CAPACITY = 100;

//tạo 1 stack rỗng với kích thước mặc định
	public ArrayStack() {
		top = 0;
		stack = (T[]) (new Object[DEAFAULT_CAPACITY]);
	}

	// tạo 1 stack rỗng với kích thước được truyền vào
	public ArrayStack(int initialCapacity) {
		top = 0;
		stack = (T[]) (new Object[DEAFAULT_CAPACITY]);
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.top == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.top;
	}

}
