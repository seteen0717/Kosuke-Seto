package varietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String, Integer> fruitsPrices = new HashMap<>();
		fruitsPrices.put("りんご", 130);
		fruitsPrices.put("みかん", 120);
		fruitsPrices.put("バナナ", 98);
		fruitsPrices.put("メロン", 6000);

		for(HashMap.Entry<String, Integer> fruit : fruitsPrices.entrySet()) {
			System.out.print(fruit.getKey());
			System.out.print(":");
			System.out.print(fruit.getValue());
			System.out.println("円");
		}
	}

}
