package variable;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int intNum = 219;
        double doubleNum =  364.2;
        long longNum = 123456L;
        System.out.println("変換前");
        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(longNum);
        long intnum = intNum;
        float doublenum = (float) doubleNum;
        double longnum = longNum;
        System.out.println("変換後");
        System.out.println(intnum);
        System.out.println(doublenum);
        System.out.println(longnum);
	}
}
