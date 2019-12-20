package branch;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("10以上の数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		if(Num >= 10) {
			System.out.println("値：" + Num);
		}
		if(Num < 10) {
			System.out.println("値：" + Num * 10);
		}
		 sc.close();
	}
}
