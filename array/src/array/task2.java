package array;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int[] array = new int[7];
        String seq = "";
        for(int i = 0; i < array.length; i++) {
        	array[i] = array.length - i;
        	if(i == array.length - 1) {
        		seq += array[i] + "";
        	}else {
        		seq += array[i] + ",";
        	}
        }
        System.out.println(seq);
        seq = "";
        for(int i = 1; i <= array.length; i++) {
        	if(i == array.length) {
        		seq += array[array.length - i] + "";
        	}else {
        		seq += array[array.length - i] + ",";
        	}
        }
        System.out.println(seq);
	}

}
