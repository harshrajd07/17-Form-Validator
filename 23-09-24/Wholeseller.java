public class Wholeseller
{
	public static void main(String[] args) 
	{
	double netbill = Double.parseDouble(args[0]);
	if(netbill<5000){
	   double discount= 5.0;
	   double discountamount = (netbill * discount)/100;
	   double amount = netbill - discountamount; 
	   System.out.println("Discount %: "+discount);
        System.out.println("Discount Amount: "+discountamount);
		System.out.println("Amount: "+amount);

	}
	else if(netbill>=5000 && netbill <10000){
	   double discount = 10.0;
	   double discountamount = (netbill * discount)/100;
	   double amount = netbill - discountamount; 
	   System.out.println("Discount %: "+discount);
        System.out.println("Discount Amount: "+discountamount);
		System.out.println("Amount: "+amount);
	}
	else if(netbill>=10000){
		double discount = 15.0;
	   double discountamount = (netbill * discount)/100;
	   double amount = netbill - discountamount; 
	   System.out.println("Discount %: "+discount);
        System.out.println("Discount Amount: "+discountamount);
		System.out.println("Amount: "+amount);
	}
		
		
        System.out.println("Netbill %: "+netbill);
	}
}
