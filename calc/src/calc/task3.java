package calc;
import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Sum = a + b + c;
        int Ave = Sum / 3;
        double ave = Sum / 3.0;
        System.out.println("合計：" + Sum);
        System.out.println("平均(3で割ったとき)" + Ave);
        System.out.println("平均(3.0で割ったとき)" + ave);


        sc.close();
	}

}
