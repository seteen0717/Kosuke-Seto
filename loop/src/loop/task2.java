package loop;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    System.out.println("数字を入力してください：" + num);
	    int i = 2;
	    int sum = 1;
	    String form = "1";
	    do{
	    	sum += i;
	        form = form + " + " + i;
	        i++;
	    }
	    while(i <= num) ;
	    System.out.println(form + " = " + sum);
	    sc.close();
	}

}
