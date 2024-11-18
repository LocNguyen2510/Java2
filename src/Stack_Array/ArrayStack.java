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

	private void expandCapacity() {
//		tạo ra mảng mới với kích thước gấp đôi
		T[] newStack = (T[]) (new Object[stack.length * 2]);
//		copy dữ liệu từ mảng cũ sang mảng mới
		for (int i = 0; i < newStack.length; i++) {
			newStack[i] = stack[i];
		}
	}

	@Override
	public void push(Object element) {
		if (size() == stack.length)
			expandCapacity(); // mở rộng kích thước của mảng ngăn xếp
	}

	@Override
	public Object pop() {
		return null;
	}

	@Override
	public Object peek() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.top == 0;
	}

	@Override
	public int size() {
		return this.top;
	}

}
