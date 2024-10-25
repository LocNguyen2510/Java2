package Multidimensional_Arrays;

import java.util.Random;

public class Matrix {
	int n;
	int[][] matrixA, matrixB;

	public Matrix(int n) {
		this.n = n;
		matrixA = new int[n][n];
		matrixB = new int[n][n];
		initRandom();
	}

	public void initRandom() {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixA[i][j] = r.nextInt(10);
				matrixB[i][j] = r.nextInt(10);
			}
		}
	}

	public void PrintMatrix(int[][] matrix) {
		System.out.println("Maxtrix: \n----------");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println();
	}

	public void PrintA() {
		PrintMatrix(matrixA);
	}

	public void PrintB() {
		PrintMatrix(matrixB);
	}

	public static void main(String[] args) {
		Matrix b = new Matrix(5);
		b.PrintA();
		b.PrintB();
	}

}
