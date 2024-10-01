public class  Sellingprice
{
	public static void main(String[] args) 
	{
		double cp = 32500;
		double profitPercentage= 27.0;
		double vatPercent= 12.70;
		double servicePercent= 3.87;
		double profit = cp*(profitPercentage/100);
		double sp = cp + profit;
		double servicecharge= cp * (servicePercent/100);
		double vatCharge = cp * (vatPercent/100);
		double totalsellingprice = sp + vatCharge + servicecharge;
		System.out.println("Sp: "+sp);
		System.out.println("Profit: "+profit);
		System.out.println("Vat: "+vatCharge);
		System.out.println("Sellinprice : "+sp);
		System.out.println("Total Selling Price : "+totalsellingprice);
        System.out.println("Service charge : "+servicecharge);
        

	}
}
