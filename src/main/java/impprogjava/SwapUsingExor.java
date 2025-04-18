package impprogjava;

public class SwapUsingExor {

	public static void main(String[] args) {
		int a=30,b=20;
		a=a^b;		System.out.println(a);
		b=a^b;		System.out.println("b="+b);
		a=a^b;		System.out.println("a="+a);
		System.out.println("********using airthmetic******");
		a=a+b;		System.out.println(a);
		b=a-b;		System.out.println("b="+b);
		a=a-b;		System.out.println("a="+a);

	}

}
