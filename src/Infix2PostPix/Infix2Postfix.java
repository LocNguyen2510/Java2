package Infix2PostPix;

public class Infix2Postfix {
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

	public static String infix2postfix(String expression) {
		expression = expression.replace(' ', ' ');
	}
}
