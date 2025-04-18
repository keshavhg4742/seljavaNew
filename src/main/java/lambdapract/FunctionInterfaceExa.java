package lambdapract;

import java.util.function.Function;

public class FunctionInterfaceExa {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=s->s*s;
		System.out.println(f.apply(4));
		
		//for String length >4
		Function<String, Integer> p=e->e.length();
		System.out.println(p.apply("santro"));

	}

}
