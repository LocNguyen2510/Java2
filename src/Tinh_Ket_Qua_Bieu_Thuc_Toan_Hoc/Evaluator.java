package Tinh_Ket_Qua_Bieu_Thuc_Toan_Hoc;

import java.util.Stack;

public class Evaluator {
	public static double calculate(double a, double b, char operator) {
		double r = 0;
		switch (operator) {
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
		return r;
	}

//hàm tính giá trị biểu thức hậu tố
	public static double evaluatePostfix(String expression) {
		Stack<Double> stack = new Stack<>();
		expression = expression.trim(); // loại bỏ khoảng trắng 2 dấu câu
		String[] tokens = expression.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(stack.toString());
			String token = tokens[i];
			if (token.matches("\\d+")) {
//				ép kiểu về số thực
				double value = Double.parseDouble(token);
				stack.push(value);
			} else {
//				nếu là toán tử, lấy 2 toán hang từ stack để thực hiện phép tính
				double b = stack.pop();
				double a = stack.pop();
				double r = calculate(a, b, token.charAt(0));
				stack.push(r);
			}
		}
		return stack.pop();
	}
}
