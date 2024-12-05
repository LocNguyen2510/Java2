package InfixtoPostfix_Review_Knowledge;

public class test {
	public static void main(String[] args) {
		String infix = "25 + 3 * 5 + (4 - 15) ^ 2";
		String postfix = InfixtoPostfix.infixToPostfix(infix);
		System.out.println("Trung tố " + infix);
		System.out.println("Hậu Tố " + postfix);
	}
}
