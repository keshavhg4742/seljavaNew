package lambdapract;

import java.util.function.Predicate;

public class LengthOfStringGreater {
//print the element which lenth greater than 4
	public static void main(String[] args) {
		String s[] = { "santro", "viro", "kavi", "sco" };
		Predicate<String> p = t -> (t.length() >= 4);
		for (String name : s) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
