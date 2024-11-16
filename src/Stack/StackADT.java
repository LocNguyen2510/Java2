package Stack;

public interface StackADT<T> {
	// push để thêm phần tử từ đỉnh của stack
	public void push(T element);

//	pop để trả về phần từ và xóa nó luôn
	public T pop();

//	peek để trả về phần tử nhưng không xóa nó
	public T peek();

//isEmpty để kiểm trả xem phương thức có rỗng hay không 
	public boolean isEmpty();

//	size để lấy ra số lượng phần tử của stack
	public int size();

//	toString để lấy ra chuỗi của stack
	public String toString();
}