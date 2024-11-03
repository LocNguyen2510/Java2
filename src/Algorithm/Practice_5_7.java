package Algorithm;

import java.util.Scanner;

public class Practice_5_7 {
	Scanner scan = new Scanner(System.in);

	public Practice_5_7() {
		StringBuilder result = new StringBuilder();
		System.out.println("Nhap N");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0 && i % 5 != 0) {
				if (result.length() == 0) {
					result.append(i);
				} else {
					result.append(", ").append(i);
				}

			}

		}
		System.out.println("Số phần từ chia hết cho 7 nhưng không phải bội số của 5 là :\n" + result.toString());
	}

	public static void main(String[] args) {
		Practice_5_7 b = new Practice_5_7();
	}
}
