package array;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int[] array = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
        String seq = "";
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        	if(i == array.length - 1) {
        		seq += array[i] + "";
        	}else {
        		seq += array[i] +", ";
        	}
        }
        System.out.println("配列：[" + seq + "]");
        System.out.println("合計：" + sum);
}
}