package No4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MapperOfIPFilter {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat regularFormat = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.US);
		Date beginDate = regularFormat.parse(args[0]);// 输入设置开始时间
		Date endDate = regularFormat.parse(args[1]);//输入设置结束时间
		String strIp = null;
		Date lineDate = null;
		String strTime = null;
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			strIp = line.split(" ")[0];// 获取ip
			strTime = line.split(" ")[3].substring(1, line.split(" ")[3].length());// 截取时间
			lineDate = regularFormat.parse(strTime);
			// 判断时间的范围，筛选出需要的时间段
			if (lineDate.before(endDate) && lineDate.after(beginDate)) {
				System.out.println(strIp + "\t" + strTime);
			}
		}
	}
}
