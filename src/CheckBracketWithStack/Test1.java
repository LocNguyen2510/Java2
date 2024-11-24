package CheckBracketWithStack;

public class Test1 {
	public static void main(String[] args) {

		LinkedStack<Integer> mystack = new LinkedStack<>();
		mystack.push(13);
		mystack.push(5);
		mystack.push(18);
		int x = mystack.pop();
		System.out.println(x);
		int y = mystack.peek();
		System.out.println(y);
		int z = mystack.pop();
		System.out.println(z);
		System.out.println("số phần tử trong mảng: " + mystack.size());

	}

}
