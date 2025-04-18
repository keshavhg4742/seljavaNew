package lambdapract;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Empl {
	String name;
	int salary;

	public Empl(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class FunctionForMultiCondi {
	//
	public static void main(String[] args) {
		ArrayList<Empl> list = new ArrayList<Empl>();
		list.add(new Empl("santro", 30000));
		list.add(new Empl("kavi", 40000));
		list.add(new Empl("vir", 50000));
		Function<Empl, Integer> f = p -> {
			int sal = p.salary;
			if (sal > 20000 && sal <= 30000)
				return (sal * 10 / 100);

			else if (sal > 30000 && sal <= 40000)
				return (sal * 20 / 100);

			else if (sal > 40000 && sal <= 60000)
				return (sal * 30 / 100);

			else
				return (sal * 40 / 100);
		};
		for (Empl e : list) {
			Integer bon = f.apply(e);
			System.out.println("sal is = " + e.salary + " bonus = " + bon + " total sal is = " + (bon + e.salary));
		}
		// useing predicator filter val bonus is >5000
		System.out.println("***********************");
		Predicate<Integer> p = c -> c > 5000;
		for (Empl e : list) {
			Integer bon = f.apply(e);
			if (p.test(bon)) {
				System.out.println("sal is = " + e.salary + " bonus = " + bon + " total sal is = " + (bon + e.salary));

			}
		}
	}
}
