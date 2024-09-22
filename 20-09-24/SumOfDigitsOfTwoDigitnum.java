public class SumOfDigitsOfTwoDigitnum
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int digitsum = num%10 + num/10;
		
		
		System.out.println("Sum of digit of number "+num+" is :"+(digitsum));
	}
}
