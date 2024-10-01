/*public class Finalbill
{
	public static void main(String[] args) 
	{ 
		
		int billOfChickenrolls = 4 * 60;
		int billOfVegetablePuffs = 3 * 25;
		int totalbill = billOfChickenrolls + billOfVegetablePuffs;
		int finalbill = totalbill - 50;
        System.out.println("Price of ChickenRolls: "+billOfChickenrolls);
		System.out.println("Price of VegetablePuffs : "+billOfVegetablePuffs);
		System.out.println("Price of Total_bill: "+totalbill);
		System.out.println("Final bill at Dominoz : "+finalbill);
	}
}


*/
public class Finalbill
{
	public static void main(String[] args)
{
int chickenrolls = 60;
int vegetablepuffs = 25;
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
int billofchickenrolls = chickenrolls * n1;
int billofvegetablepuffs = vegetablepuffs * n2;
int totallbill = billofchickenrolls + billofvegetablepuffs;
int discount =50;
int finalbill = totallbill - discount;
System.out.println("Price of ChickenRolls: "+billofchickenrolls);
System.out.println("Price of VegetablePuffs : "+billofvegetablepuffs);
System.out.println("Price of Total_bill: "+totallbill);
System.out.println("Final bill at Dominoz : "+finalbill);
}
}


