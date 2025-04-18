package santro.seljava;
	
class Kesh
{
	public String s;
}


public class Strdes extends Kesh
{
	public String s;
	public Strdes(String s) 
	{
		super.s=s;
	}
 	public static void main(String[] args)
	{ 
 		String s="Santosh";
 		Strdes strdes = new Strdes("Keshay");
 		System.out.println(strdes.s);
 		System.out.println(s);
 		strdes.St();
	}	
 	public void St() 
	{
 		System.out.println(super.s);
	}
 	
}




