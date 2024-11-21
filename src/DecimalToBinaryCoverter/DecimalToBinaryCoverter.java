package DecimalToBinaryCoverter;

public class DecimalToBinaryCoverter {
	public static String demalToBinary(int decimal) {
		ArrayStack<Integer> stack = new ArrayStack<>();
		while (decimal > 0) {
			int remainder = decimal % 2;// lấy ra số dư khi chia cho 2
			stack.push(remainder);
			decimal = decimal / 2;
		}
//		lấy các bit từ stack và ghép lại thành chuỗi số nhị phân
		StringBuilder binary = new StringBuilder();
		while (!stack.isEmpty()) {
			binary.append(stack.pop());
		}
		return binary.toString();
	}
}
