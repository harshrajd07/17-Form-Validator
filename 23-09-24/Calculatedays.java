public class  Calculatedays
{
	public static void main(String[] args) 
	{
		int days =Integer.parseInt(args[0]);
		int y,m,w,d;
		y=days/365;
		days=days%365;
		m=days/30;
		days=days%30;
		w=days/7;
		d=days%7;
		System.out.println("Number of Years: "+y);
		System.out.println("Number of Months: "+m);
		System.out.println("Number of weeks: "+w);
		System.out.println("Number of days: "+d);
	}
}
