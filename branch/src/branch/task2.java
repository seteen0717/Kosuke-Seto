package branch;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >= 10) {
			System.out.println("値：" + num);
	    } else {
	    	System.out.println("値： 0" +  num);
	    }
		 sc.close();
	}
}
