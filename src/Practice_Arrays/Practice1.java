package Practice_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
	float[] a;// Khai bao mang
	int n; // so luong phan tu
	Scanner scanner = new Scanner(System.in);

	public Practice1() {
		System.out.println("Nhap So Luong Phan Tu Cua Mang");
		n = scanner.nextInt();
		a = taoMangSoThuc(n);
		PrintA();
	}

// 	Viết phương thức in ra mảng
	public void PrintA() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

//	Viết phương thức trả về số mảng với n phần tử 

	public float[] taoMangSoThuc(int n) {
		Random r = new Random();// tạo ra random giá trị ngẫu nhiên của mảng
		float[] temp = new float[n];
		for (int i = 0; i < n; i++) {
			temp[i] = r.nextFloat();
		}
		return temp;
	}

//	Thêm 1 phần tử x vào cuối mảng 

	public void addX(float x) {
		// tăng n để tạo thêm ô trống trong mảng
		n = n + 1; // hoặc n= a.length + 1 đều được
		float[] temp = new float[n];// thay đổi mảng cộng thêm 1 ô trống |1|2|3|4|=>|1|2|3|4|rỗng|
// Copy dữ liệu
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		// thêm x vào cuối mảng |1|2|3|4|=>|1|2|3|4|X|
		temp[n - 1] = x;// vì mảng i=0 nên n-1 là số cuối cùng của mảng (phần rỗng của mảng)
		// gán lại cho mảng ban đầu
		a = temp;
	}

// 	Tính tổng 2 phần tử đầu tiên
	public void sum2FirstElements() {
		float sum = 0;
		if (a.length >= 1) {
			sum += a[0];
		}
		if (a.length >= 2) {
			sum += a[1];
		}
//		Cách 2:
//		for (int i = 0; i <= 1 && i < a.length; i++) {
//			sum += a[i];
//		}
		System.out.println("Tổng 2 phần tử đầu tiên: " + sum);

	}

	public static void main(String[] args) {
		Practice1 b = new Practice1();
		System.out.println("\nsau khi add ");
		b.addX(1.5f);
		b.PrintA();

		b.sum2FirstElements();
	}
}
