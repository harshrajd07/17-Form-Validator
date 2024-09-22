public class Pallindrome
{
	public static void main(String[] args) 
	{
		int n1=Integer.parseInt(args[0]);
		int r,rev=0;
		int temp=n1;
		while(n1!=0){
		r=n1%10;//121%10=1  r=1  12%10=2 r=2   1%10=1  r=1
		rev=rev*10+r;//rev=1   rev=1*10+2   rev=12   rev=12*10=120+1    rev=121
		n1=n1/10;//n1=12   n1=12/10=1  n1=1/10=0 
		}
		if(temp==rev)
			{System.out.println("Pallindrome");
		}
		else
			{System.out.println("Not a Pallindrome");
		}
		
	}
}
