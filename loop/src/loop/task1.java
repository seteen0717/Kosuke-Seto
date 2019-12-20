package loop;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    System.out.println("数字を入力してください：" + num);
	    int i = 1;
	    int sum = 0;
	    while(i <= num) {
	    	sum += i;
	    	i++;
	    }
	    System.out.println("1〜" + num + "までの合計：" + sum);
	    sc.close();
	}

}
