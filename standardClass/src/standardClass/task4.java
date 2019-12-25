package standardClass;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "ABCDGOPQRSYZ";
		System.out.print("探したい文字：");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(str.indexOf(input) >= 0) {
			System.out.println(str + "は" + input + "を含む");
		} else {
			System.out.println(str + "は" + input + "を含まない");
		}
		sc.close();
	}

}
