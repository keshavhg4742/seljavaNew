package lambdapract;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExamp {

	public static void main(String[] args) {
		//supplier which will return something
		//which will not getanything
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());

	}

}
