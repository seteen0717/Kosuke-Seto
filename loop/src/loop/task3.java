package loop;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    long num = sc.nextLong();
	    System.out.println("数字を入力してください：" + num);
	    int i = 1;
	    int count = 0;
	    while(i <= num) {
	    	i *= 10;
	    	count++;
	    }
	    System.out.println("桁数：" + count);
	    sc.close();
	}

}


