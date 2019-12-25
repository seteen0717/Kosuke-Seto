package standardClass;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "cat_mouse_mouse_cat_cat";
		int catCount = 0, mouseCount = 0;
		for(int i = 0; i < str.length() - 2; i++) {
			if(str.substring(i, i + 3).equals("cat")) {
				catCount++;
			}
		}
		for(int i = 0; i < str.length() - 4; i++) {
			if(str.substring(i, i + 5).equals("mouse")) {
				mouseCount++;
			}
		}
		if(catCount > mouseCount) {
			System.out.println("catの方が多い");
		} else if(catCount < mouseCount) {
			System.out.println("mouseの方が多い");
		} else {
			System.out.println("どちらも同じ");
		}
	}

}
