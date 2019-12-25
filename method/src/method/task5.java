package method;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	String[] array1 = {"apple", "banana"};
	String[] array2 = {null, "banana"};
	System.out.println("ーーー配列にnullがない場合ーーー");
	System.out.println(nullCheck(array1));
	System.out.println("ーーー配列にnullがある場合ーーー");
	System.out.println(nullCheck(array2));
	}

	public static boolean nullCheck(String[] array) {
		boolean result = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				result = true;
				break;
			}
		}
		return result;
	}
}
