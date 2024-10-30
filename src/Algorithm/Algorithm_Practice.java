package Algorithm;

import java.util.Scanner;

public class Algorithm_Practice {
	int a;
	int b;

	static Scanner scan = new Scanner(System.in);

	public Algorithm_Practice() {

	}

	public void Calculator() {
		System.out.println("Phương trình Ax + B = 0");
		System.out.println("Nhập số A: ");
		a = scan.nextInt();
		System.out.println("Nhập số B: ");
		b = scan.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("phương trình vô số nghiệm");
		}
		if (a == 0 && b != 0) {
			System.out.println("phương trình vô nghiệm");
		} else {
			System.out.println("Phương trình có nghiệm X= " + ((float) -b / a));
		}
	}

	public static void main(String[] args) {
		Algorithm_Practice b = new Algorithm_Practice();
		b.Calculator();
	}
}
