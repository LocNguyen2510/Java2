package Generic;

public class Test {
	public static void main(String[] args) {
		// Ví dụ 1:

		Dictionary<String, String> d1 = new Dictionary<>("Book", "Sách");
		System.out.println(d1.toString());
		Dictionary<String, String>[] tuDienAnhViet = new Dictionary[10];
		tuDienAnhViet[0] = new Dictionary<String, String>("Hello", "Xin chao");
		tuDienAnhViet[1] = new Dictionary<String, String>("Mouse", "Chuot");
		tuDienAnhViet[2] = new Dictionary<String, String>("Cat", "Meo");
		tuDienAnhViet[3] = new Dictionary<String, String>("Dog", "Cho");
		for (int i = 0; i < 4; i++) {
			System.out.println(tuDienAnhViet[i]);
		}

//		Ví dụ 2:
		Dictionary<Integer, Character>[] bangMaASCii = new Dictionary[256];
		bangMaASCii[0] = new Dictionary<>(33, '!');
		bangMaASCii[1] = new Dictionary<>(34, '"');
		bangMaASCii[2] = new Dictionary<>(35, '#');
		for (int i = 0; i < 3; i++) {
			System.out.println(bangMaASCii[i]);
		}

	}
}