package InfixtoPostfix_Review_Knowledge;

import java.util.Stack;

public class InfixtoPostfix {
	private static int precendence(char operate) {
		switch (operate) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;

		}
		return -1;
	}

	public static String infixToPostfix(String exper) {
		exper = exper.replace(" ", "");
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		boolean check = false;
		for (int i = 0; i < exper.length(); i++) {
			char c = exper.charAt(i);

			if (Character.isDigit(c)) {
				if (check) {
					result += c;
				} else {
					result += (" " + c);
				}
				check = true;
			} else {
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					while (!stack.isEmpty() && stack.peek() != '(') {
						result += stack.pop();
					}
					stack.pop();
				} else {
					while (!stack.isEmpty() && precendence(c) <= precendence(stack.peek())) {
						result += (" " + stack.pop());
					}
					stack.push(c);
				}
				check = false;
			}

		}
		while (!stack.isEmpty()) {
			result += stack.pop();

		}
		return result;

	}
}
