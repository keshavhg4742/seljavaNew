package lambdapract;

interface Cse{
	public String doGet(String as,String b);
}

public class LambdaExpTPar {

	public static void main(String[] args) {
		Cse c=(a,b)->{System.out.println("the name is "+ a +" val is= "+ b);
					return ("boss");};
		System.out.println(c.doGet("rohit", "sharma"));
	}

}
