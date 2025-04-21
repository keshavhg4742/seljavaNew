package lambdapract;

import java.util.function.Function;

/*
 * andThen()--result of f1 is ip of f2
 * compose()-- it is reverse first f2 calculate then f2 op is ip of f1
 * */
public class FunctionChain {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n -> n * 2;
		Function<Integer, Integer> f2 = n -> n * n * n;
		System.out.println(f1.andThen(f2).apply(2));

		System.out.println(f1.compose(f2).apply(2));

	}

}
