package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//创建一个可以使用正则表达式来解析基本类型和字符串的简单文本扫描器的队象。 
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//自定义解析日期的具体规范
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		while (scanner.hasNext()){//如果输入没有到最后一行，则返回ture
			String line = scanner.nextLine();//每次循环定义一个String类型的line，并把当前行赋给line
			Date lineDate = null;//定义一个Date类型的lineDate
			long lineTimestamp;//Long类型的lineTimeStamp
			try {
				lineDate = inputFormat.parse(line);// 解析字符串的文本，生成 Date类型。
				lineTimestamp = lineDate.getTime();//类型转换
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);//输出你的输入和转换后的时间
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
