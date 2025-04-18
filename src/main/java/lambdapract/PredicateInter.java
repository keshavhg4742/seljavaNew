package lambdapract;

import java.util.function.Predicate;

public class PredicateInter {
//Predicate is functional interface which is having one abstract method
	// boolean test(T t) which take one par return boolenan
	// we can use in conditions checking
	public static void main(String[] args) {
		Predicate<Integer> p=t->(t>10);
		System.out.println(p.test(13));
		System.out.println(p.test(9));
		
		//example 2
		Predicate<String> s=r->(r.length()>4);
		System.out.println(s.test("viraj"));

	}

}
