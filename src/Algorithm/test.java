package Algorithm;

public class test {
	int s = 0;
	int i = 1;
	int j;
	int n = 4;

	public test() {
		while (i <= n) {
			j = n - i;
			while (j >= 1) {
				s += i;
				j -= i;
				System.out.println("day la s: " + s);
				System.out.println("day la j: " + j);
				break;

			}
			i += 1;
			System.out.println("day la i: " + i);
		}
//		System.out.println("day la i: " + i);

	}

	public static void main(String[] args) {
		test b = new test();
	}
}
