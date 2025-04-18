package javabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

class A implements Comparable<A> {
	int a;
	String s;

	public A(int a, String s) {
		this.a = a;
		this.s = s;

	}
	

	@Override
	public String toString() {
		return "A [a=" + a + ", s=" + s + "]";
	}


	@Override
	public int compareTo(A o) {
		if (a==o.a) return 0;
		else if (a>o.a) return 1;
		return -1;
		
	}
}

public class Compa {

	public static void main(String[] args) {
		
		
		/*
		 * A a1=new A(1, "ww"); A a2=new A(6, "aa"); A a3=new A(4, "qq");
		 */
		ArrayList<A> list = new ArrayList<A>();
		list.add(new A(1, "ww"));
		list.add(new A(6, "aa"));
		list.add(new A(4, "qq"));
		Collections.sort(list);
		// System.out.println(list);
		Iterator<A> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
