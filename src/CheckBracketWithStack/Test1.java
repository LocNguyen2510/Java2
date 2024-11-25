package CheckBracketWithStack;

public class Test1 {
	public static void main(String[] args) {
		String code1 = "{[()]}";
		String code2 = "{()]}";
		String code3 = "{[()}";
		String code4 = "\r\n" + "public class LinkedNode<T> {\r\n" + "	private T data;\r\n"
				+ "	private LinkedNode<T> next;\r\n" + "\r\n" + "	public LinkedNode() {\r\n" + "\r\n" + "	}\r\n"
				+ "\r\n" + "	public T getData() {\r\n" + "		return data;\r\n" + "	}\r\n" + "\r\n"
				+ "	public void setData(T data) {\r\n" + "		this.data = data;\r\n" + "	}\r\n" + "\r\n"
				+ "	public LinkedNode<T> getNext() {\r\n" + "		return next;\r\n" + "	}\r\n" + "\r\n"
				+ "	public void setNext(LinkedNode<T> next) {\r\n" + "		this.next = next;\r\n" + "	}\r\n" + "\r\n"
				+ "	public LinkedNode(T data, LinkedNode<T> next) {\r\n" + "		this.data = data;\r\n"
				+ "		this.next = next;\r\n" + "	}\r\n" + "}";
		System.out.println("Check code1: " + BracketChecker.isBalanced(code1));
		System.out.println("Check code1: " + BracketChecker.isBalanced(code2));
		System.out.println("Check code1: " + BracketChecker.isBalanced(code3));
		System.out.println("Check code1: " + BracketChecker.isBalanced(code4));
	}

}
