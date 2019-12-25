package standardClass;
import java.text.SimpleDateFormat;
import java.util.Date;
public class task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		System.out.println(sdf.format(now));
		System.out.println(sdf2.format(now));

	}

}
