package Algorithm;

import java.util.Scanner;

public class a1_a2_a3 {
	int n;
	int sum;
	int nhan = 1;
	Scanner scan = new Scanner(System.in);

	public a1_a2_a3() {

	}

	public void printA() {
		System.out.println("nhập n phần tử cần in ");
		n = scan.nextInt();
		System.out.printf("Phần tử từ 1 đến %d: \n", n);
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			sum += i;
			nhan *= i;
		}
		System.out.println("\nTổng là: " + sum);
		System.out.println("Tích là: " + nhan);
	}

	public static void main(String[] args) {
		a1_a2_a3 b = new a1_a2_a3();
		b.printA();
	}
}
