package loop;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    System.out.println("正の整数を入力してください：" + num);
	    String seq = "1";
	    for(int i = 2; i <= num; i++) {
	    	if(num % i ==0) {
	    		seq += "," + i;
	    	}
	    }
	    System.out.println(num + "の約数：" + seq);
	    sc.close();
	}

}
