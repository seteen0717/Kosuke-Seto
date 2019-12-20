package loop;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String seq = "";
        for(int i = 1; i < 10; i++) {
        	for(int j = 1; j < 10; j++) {
        		if(i * j < 10) {
        		   seq += "  " + i * j;
        	    }else {
        		   seq += " " + i * j;
        	}
        	}
        	System.out.println(seq);
        	seq = "";

	}

}
}
