package method;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double square = square(7, 4.25);
		System.out.println("三角形の面積");
		System.out.println(square);
	}
	public static double square(double bottom, double height) {
		return Math.round(bottom) * Math.round(height) / 2;
	}
}
