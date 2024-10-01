public class Stringtodouble 
{
	public static void main(String[] args) 
	{
		//string s1 = "12346787"
		//double string = Double.parseDouble(str);
        double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[1]);
		float result =(float)n1 * (float)n2;
		System.out.println("Multiply of two floating numbers "+n1+" and "+n2+" is  : "+result);
	}
}
