package branch;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    int numA = sc.nextInt();
	    int numB = sc.nextInt();
	    System.out.println("numA：" + numA);
	    System.out.println("numB：" + numB);
	    if(numA % numB == 0 && numA > 0 && numB > 0) {
	    	System.out.println("numBはnumAの約数です");
	    }else if(numA % numB != 0 && numA > 0 && numB > 0) {
	    	System.out.println("numBはnumAの約数ではありません");
	    }else {
	    	System.out.println("正の整数を入力してください");
	    }
	    sc.close();
	}

}
