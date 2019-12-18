package calc;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        String Str = "ノートPCの値段：";
        int Int = 89800;
        char cha = '円';
        System.out.println(Str + Int + cha);
        Scanner sc = new Scanner(System.in);
        String Str1 = sc.nextLine();
        String Str2 = sc.nextLine();
        System.out.println(Str1 + Str2);

        sc.close();
	}

}
