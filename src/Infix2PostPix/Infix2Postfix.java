package Infix2PostPix;

import java.util.Stack;

public class Infix2Postfix {
//	hàm xác định độ ưu tiên của toán tử
	private int precendence(char operator) {
		switch (operator) {
		case '+':
		case '_':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;

		}
		return -1;
	}

//hàm chuyển từ trung tố sang hậu tố
	public static String infix2postfix(String expression) {
		expression = expression.replace(' ', ' ');
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				result += c;
			} else {

			}
		}
	}
}
