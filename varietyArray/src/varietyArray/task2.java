package varietyArray;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 1) {
				oddNumbers.add(numbers[i]);
			} else {
				evenNumbers.add(numbers[i]);
			}
		}
		System.out.println("奇数：" + oddNumbers);
		System.out.println("偶数：" + evenNumbers);
	}

}
