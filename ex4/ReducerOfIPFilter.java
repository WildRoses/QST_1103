package No4;

import java.util.HashSet;
import java.util.Scanner;

public class ReducerOfIPFilter {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String InIp=null;//储存ip
		HashSet<String> set=new HashSet<String>(); //记录不重复的ip
		while (scanner.hasNext()){
			String line = scanner.nextLine();
			InIp=line.split("\t")[0];
			set.add(InIp);
		}
		System.out.println("该时间段访问的ip数"+set.size());//ip的数量，即是set的大小
	}
}
