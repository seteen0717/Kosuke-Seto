package standardClass;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "文字列：ABCDEFG";
		String str1 = "";

		for(int i = str.length() - 1; i >= 0; i--) {
			char x = str.charAt(i);
			str1 += x;
		}
		System.out.println(str);
		System.out.println(str1);
	}

}
