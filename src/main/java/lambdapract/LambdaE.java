package lambdapract;
@FunctionalInterface
interface B{
	public void name();
		
}

public class LambdaE {

	public static void main(String[] args) {
		B b=()->System.out.println("hi");
		b.name();
	}
}
