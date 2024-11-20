package Reverse_Stack_Array;

public class StringReversal {
	public static String reverseString(String input) {
		ArrayStack<Character> stack = new ArrayStack<Character>();
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		return reversed.toString();
//		String reversed = "";
//		while (!stack.isEmpty()) {
//			reversed = reversed + stack.pop();
//
//		}
//		return reversed;
	}
}
