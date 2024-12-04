package Infix2PostPix;

public class Test {
	public static void main(String[] args) {
		String infix = "3 + 4 * 2 / (1 - 5) ^ 2";
		String postfix = Infix2Postfix.infix2postfix(infix);
		System.out.println(infix);
		System.out.println(postfix);
		String infix1 = "32 + 4 * 2 / (16 - 543) ^ 2";
		String postfix1 = Infix2Postfix.infix2postfix(infix1);
		System.out.println(infix1);
		System.out.println(postfix1);
	}
}
