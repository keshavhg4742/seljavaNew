package lambdapract;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Ems {
	public String name;
	public int salry;
	public String gender;

	public Ems(String name, int salry, String gender) {
		this.name = name;
		this.salry = salry;
		this.gender = gender;
	}

}

public class ConsumerExample {

	public static void main(String[] args) {
		ArrayList<Ems> list = new ArrayList<Ems>();
		list.add(new Ems("santro", 50000, "male"));
		list.add(new Ems("kavi", 560000, "female"));
		list.add(new Ems("ambala", 70000, "male"));

		Function<Ems, Integer> f = s -> (s.salry * 10) / 100; // cal bon
		Predicate<Integer> p = r -> r > 5000;

		Consumer<Ems> c = w -> {
			System.out.print(w.name + "  ");
			System.out.print(w.gender + "  ");
			System.out.print(w.salry + "  ");
		};

		for (Ems e : list) {
			Integer bonus = f.apply(e);
			if (p.test(bonus)) {
				c.accept(e);
				System.out.println(bonus);

			}
		}
	}
}
