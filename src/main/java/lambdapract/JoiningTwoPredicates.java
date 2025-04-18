package lambdapract;

import java.util.function.Predicate;

public class JoiningTwoPredicates {
	// print even number and val greatr tan 40
	public static void main(String[] args) {
		int a[] = { 4, 50, 60, 55, 77, 88, 22, 30, 69 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 40;
		for (int n : a) {
			if (p1.and(p2).test(n)) {
				// if(p1.test(n) && p2.test(n)){
				System.out.println(n);

			}
		}
	}
}
