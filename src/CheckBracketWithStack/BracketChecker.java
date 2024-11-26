package CheckBracketWithStack;

public class BracketChecker {
	public static boolean isBalanced(String code) {
		LinkedStack<Character> stack = new LinkedStack<Character>();
		// duyệt từng kí tự
//		tình huống thứ 0: những kí tự khác => không quan tâm 
//		tình huống thứ 1: Mở ngoặc [,{,(
		for (int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else if (ch == '}' || ch == ']' || ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
//				tình huống thứ 2: Đóng ngoặc ], }, )
//				Kiểm tra stack có rỗng hay không. nếu rỗng là sai 
//				nếu không rỗng => lấy kí tự ở đỉnh stack =>  nếu kí tự ở đỉnh stack giống với kí tự hiện tại => true 
//				còn ngược lại sẽ là false
				char top = stack.pop();
				if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
//		
	}
}
