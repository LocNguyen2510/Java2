package Multidimensional_Arrays;

import java.util.Scanner;

public class Matrix2 {
	Scanner scan = new Scanner(System.in);
	int[][] a;
	int n;

	public Matrix2() {
		System.out.println("nhập số lượng mảng: ");
		n = scan.nextInt();
		a = new int[n][n];
		initArrays();
	}

	public void initArrays() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();

			}

		}
	}

	public void PrintMatrix(int[][] matrix) {
		System.out.println("Maxtrix: ");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

	public void printA() {
		PrintMatrix(a);
	}

	public static void main(String[] args) {
		Matrix2 b = new Matrix2();
		b.printA();

	}
}
