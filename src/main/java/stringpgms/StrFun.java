package stringpgms;

public class StrFun {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello");
		str.append(" hi");
		System.out.println(str);
		str.insert(2, "we");
		System.out.println(str);

	}

}
