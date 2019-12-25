package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class task7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("現在日時：" + sdf.format(now));

		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("１週間後：" + sdf.format(cal.getTime()));

		cal.set(cal1.get(Calendar.YEAR) + 1, cal1.get(Calendar.MONTH), cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("１年後：" + sdf1.format(cal.getTime()));

	}

}
