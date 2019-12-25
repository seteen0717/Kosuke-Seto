package loop;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数字を入力してください：");
		Scanner sc = new Scanner(System.in);
	    long num = sc.nextLong();
	    int count = 0;
	    while(num > 0) {
	    	num /= 10;
	    	count++;
	    }
	    System.out.println("桁数：" + count);
	    sc.close();
	}

}


