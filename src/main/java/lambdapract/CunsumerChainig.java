package lambdapract;

import java.util.function.Consumer;

public class CunsumerChainig {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s+" name of");
		Consumer<String> cs=s->System.out.println(s+" name of");
		Consumer<String> ce=s->System.out.println(s+" name of");
			
	//	c.andThen(ce).andThen(cs).accept("ambala");
		c.accept("work of");
		

	}

}
