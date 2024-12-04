package Infix2PostPix;

import java.util.Stack;

public class Infix2Postfix {
//	hàm xác định độ ưu tiên của toán tử
	private static int precendence(char operator) {
		switch (operator) {
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

//hàm chuyển từ trung tố sang hậu tố
	public static String infix2postfix(String expression) {
		expression = expression.replace(" ", "");
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		boolean checkPrevIsDigit = false;
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
//			nếu là số, thêm vào kết quả
			if (Character.isDigit(c)) {
				if (checkPrevIsDigit) {
					result += c;
				} else {
					result += (" " + c);
				}
				checkPrevIsDigit = true;
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
			else {
				while (!stack.isEmpty() && precendence(c) <= precendence(stack.peek())) {
					result += (" " + stack.pop());
				}
				stack.push(c);
			}
//			gan false
			checkPrevIsDigit = false;
//đưa tất cả các toán tử còn lại của stack ra kết quả

		}
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}
}
