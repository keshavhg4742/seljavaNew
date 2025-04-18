package lambdapract;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Emp{
	String name;
	int salary;
	public Emp(String name,int salary) {
		this.name=name;
		this.salary=salary;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = "+ name+" salry = "+salary;
	}
}

public class ObjComparLambda {

	public static void main(String[] args) {
		Emp emp = new Emp("santro",40000);
		Predicate<Emp> e=p->(p.name.length()>3 &&p.salary>20000);
		System.out.println(e.test(emp));
		//for multiple objs
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("santu", 30000));
		list.add(new Emp("bantu", 40000));
		list.add(new Emp("montu", 10000));
		for (Emp dt : list) {
			if (e.test(dt)) {
				System.out.println(dt);
			}
			
		}

	}

}
