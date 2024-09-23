public class  Simpleinterest
{
	public static void main(String[] args) 
	{
		double  principal = Double.parseDouble(args[0]);
		double  rate= Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		double simpleinterest = (principal * rate * time)/100;
		double amount = (principal + simpleinterest);
		System.out.println("Simple Interest: "+simpleinterest);
		System.out.println("Amount: "+amount);

	}
}
