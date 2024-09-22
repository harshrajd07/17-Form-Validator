public class Totalsalary
{
	public static void main(String[] args) 
	{
		double basicsalary = Integer.parseInt(args[0]);
		double hra=basicsalary * 0.15;
		double conveyanceallowance=basicsalary * 0.15;
		double entertainmentallowance=basicsalary * 0.10;
		double totalsalary = basicsalary + hra + conveyanceallowance + entertainmentallowance;
		System.out.println("Basic Salary: "+basicsalary);
		System.out.println("HRA: "+hra);
		System.out.println("Conveyance Allowance: "+conveyanceallowance);
		System.out.println("Entertainment Allowance: "+entertainmentallowance);
		System.out.println("Total Salary: "+totalsalary);
	}
}
