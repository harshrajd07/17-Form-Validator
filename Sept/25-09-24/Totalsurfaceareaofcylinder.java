public class Totalsurfaceareaofcylinder
{
	public static void main(String[] args) 
	{
		double r =Double.parseDouble(args[0]);
		double h =Double.parseDouble(args[1]);
		double pi=3.14;
        double areaofcylinder = 2*pi*r(h+r);
		
		System.out.println("Total Surface area of cylinder: "+areaofcylinder);
	}
}
