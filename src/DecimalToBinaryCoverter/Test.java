package DecimalToBinaryCoverter;

public class Test {
	public static void main(String[] args) {

		ArrayStack<Integer> mystack = new ArrayStack<>();
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
