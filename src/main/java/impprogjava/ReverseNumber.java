package impprogjava;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 123;
		int reverese = 0;
		int lastDigit;
		while (number != 0) {		//in 1st iteration
			lastDigit = number % 10;	//here we get reminder i.e =3
			
			if(reverese>Integer.MAX_VALUE/10||(reverese==Integer.MAX_VALUE/10 && lastDigit>7))
			{	//bcoz int can hold 7 digits if we reverse 7digt num it will over flow and peint -digit
				System.out.println(0); //if number is overflow then print 0
				System.exit(0);
			}
			if(reverese<Integer.MIN_VALUE/10||(reverese==Integer.MIN_VALUE/10 && lastDigit<-8))
			{
				System.out.println(0);
				System.exit(0); //for underflow
			}
			reverese = reverese * 10 + lastDigit; //here we add it to reverse
			number = number / 10; //here we get qoutionte of number ie=12
		}
		System.out.println(reverese);
	}
}
