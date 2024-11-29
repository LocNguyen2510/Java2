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

		}
	}
}
