package Tinh_Ket_Qua_Bieu_Thuc_Toan_Hoc;

import java.util.Stack;

public class Evaluator {
//hàm tính giá trị biểu thức hậu tố
	public static double evaluatePostfix(String expression) {
		Stack<Double> stack = new Stack<>();
		expression = expression.trim(); // loại bỏ khoảng trắng 2 dấu câu
		String[] tokens = expression.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.matches("\\d+")) {
//				ép kiểu về số thực
				double value = Double.parseDouble(token);
				stack.push(value);
			} else {
//				nếu là toán tử, lấy 2 toán hang từ stack để thực hiện phép tính
				double a = stack.pop();
				double b = stack.pop();
				double r = 0;
				switch (token.charAt(0)) {
				case '+':
					r = a + b;
					break;
				case '-':
					r = a - b;
					break;
				case '*':
					r = a * b;
					break;
				case '/':
					r = a / b;
					break;
				case '^':
					r = Math.pow(a, b);
					break;
				}
				stack.push(r);
			}
		}
	}
}
