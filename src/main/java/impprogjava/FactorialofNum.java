package impprogjava;

import java.math.BigInteger;

public class FactorialofNum {

	public static void main(String[] args) {
		int num = 45;
		BigInteger result = BigInteger.ONE; //bcoz int cant hold big number it gives 0 result
		for (int i = 1; i <= num; i++) {
			result = result.multiply(BigInteger.valueOf(i));

		}
		System.out.println(result);
	}
}
