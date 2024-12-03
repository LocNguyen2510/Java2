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
//				nếu gặp dấu mở ngoặc thì đẩy vào stack
			} else if (c == '(') {
				stack.push(c);
//				nếu gặp dấu đóng ngoặc thì đưa các phần tử ra cho đến khi gặp dấu đóng hoặc rỗng thì dừng
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				stack.pop();// loại bỏ dấu mở ngoặc
			}
//			nếu là toán tử
		}
	}
}
