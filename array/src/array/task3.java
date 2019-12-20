package array;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int[] array = new int[6];
        String seq = "";
        int max = 0, min = 9;
        for(int i = 0; i < array.length; i++) {
        	array[i] = new java.util.Random().nextInt(10);
        	if(i == array.length - 1) {
        		seq += array[i] + "";
        	}else {
        		seq += array[i] + ",";
        	}
        	if(max < array[i]) {
            	max = array[i];
            }
            if(min > array[i]){
            	min = array[i];
            }
         }
        System.out.println("[" + seq + "]");
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);

	}

}
