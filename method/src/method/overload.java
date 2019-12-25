package method;

public class overload {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String sumA = add("文字列１", "文字列２");
		int sumB = add(6, 9);
		double sumC = add(3.7, 5.3);
		System.out.println("ーーー①文字列のみの場合ーーー");
		System.out.println(sumA);
		System.out.println("ーーー②整数のみの場合ーーー");
		System.out.println(sumB);
		System.out.println("ーーー③少数の場合ーーー");
		System.out.println(sumC);
	}

	public static String add(String a, String b) {
		return a + b;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
}
