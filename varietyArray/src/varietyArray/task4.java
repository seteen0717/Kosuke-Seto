package varietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60
				, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 1) {
				oddNumbers.add(numbers[i]);
			} else {
				evenNumbers.add(numbers[i]);
			}
		}
		HashMap<String, ArrayList<Integer>> naturalNumbers = new HashMap<>();
		naturalNumbers.put("奇数：", oddNumbers);
		naturalNumbers.put("偶数：", evenNumbers);
		/*
		for(HashMap.Entry<String, ArrayList<Integer>> natural : naturalNumbers.entrySet()) {
			System.out.print(natural.getKey());
			System.out.print(":");
			System.out.println(natural.getValue());
		}
		*/
		System.out.print(naturalNumbers);
	}

}
