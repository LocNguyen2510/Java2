package Generic;

import java.util.Scanner;

public class TinhTrungBinhCong {
	int n;
	int[] mangInt;
	Scanner scan = new Scanner(System.in);

//	public TinhTrungBinhCong() {
//		nhapMang();
//		printA();
//	}
//
//	public void nhapMang() {
//		System.out.println("nhap so luong mang: ");
//		n = scan.nextInt();
//		mangInt = new int[n];
//		for (int i = 0; i < n; i++) {
//			mangInt[i] = scan.nextInt();
//		}
//	}
//
//	public void printA() {
//		System.out.println("Mang la: ");
//		for (int i = 0; i < n; i++) {
//			System.out.println(mangInt[i] + " ");
//		}
//	}

	public static <T> double TinhTBC(T[] mang) {
		double tong = 0;
		for (int i = 0; i < mang.length; i++) {
			double value = Double.valueOf(mang[i] + "");
			tong += value;
		}
		return tong / mang.length;
	}

	public static void main(String[] args) {
//		TinhTrungBinhCong b = new TinhTrungBinhCong();
		Integer[] mang = { 2, 6, 7 };
		System.out.println("TBC la : " + TinhTBC(mang));
		Float[] mangF = { 3.5f, 4.5f, 2f };
		System.out.println("TBC Float la: " + TinhTBC(mangF));
		Double[] mangD = { 1.6d, 5.3d, 2.8d };
		System.out.println("TBC Double la: " + TinhTBC(mangD));
		String[] mangS = { "1.6", "4", "2.8" };
		System.out.println("TBC String la: " + TinhTBC(mangS));

	}
}
