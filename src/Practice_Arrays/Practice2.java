package Practice_Arrays;

import java.util.Scanner;

public class Practice2 {
	Scanner scan = new Scanner(System.in);
	int n;
	int[] a;

	public Practice2() {
		System.out.println("nhap số lượng mảng: ");
		n = scan.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap mang thu " + (i + 1));
			a[i] = scan.nextInt();
		}
		System.out.println("In mang");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Practice2 b = new Practice2();

	}

}
