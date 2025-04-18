package javabase;

import java.util.jar.Attributes.Name;

interface As {
	public void name();
}
 class sa
 {
	 int as;
	 public sa(int as) {
		this.as=as;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "val of as"+as;
	}
 }
public class Santro {

	public static void main(String[] args) {
		As as = new As() {

			@Override
			public void name() {
				System.out.println("asj");
				
			}

			
		};
		as.name();
		sa sa = new sa(20);
		System.out.println(sa.as);

	}
}
