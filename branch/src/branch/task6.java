package branch;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1から5までの数字を入力してください");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
        String Num = "";
	    switch(num) {
	        case 1:
	        	Num = "Ⅰ";
	        	break;
	        case 2:
	        	Num = "Ⅱ";
	    	    break;
	        case 3:
	        	Num = "Ⅲ";
	    	    break;
	        case 4:
	        	Num = "Ⅳ";
	    	    break;
	        case 5:
	        	Num = "Ⅴ";
	    	    break;
	        default:
	        	Num = "unknown";
	    	    break;
	    }
	    System.out.println(num + " -> " + Num);
	    sc.close();
	    }

	}


