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
		Stack<Character> stack = new Stack<>();
		boolean check = false;
		for (int i = 0; i < exper.length(); i++) {
			char c = exper.charAt(i);
			if (!stack.isEmpty()) {

			}
		}

	}
}
