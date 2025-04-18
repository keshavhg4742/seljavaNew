package impprogjava;
import java.util.Iterator;
public class LastWordLenth {

	public static void main(String[] args) {
		String s = "   hello    world   how ";
		int count = 0;
		s=s.trim();
		char[] inputArray = s.toCharArray();
		for (int i = inputArray.length-1; i >= 0; i--) {
			if (inputArray[i] != ' ') {
				count = count + 1;
			} else if (count > 0) {
				System.out.println(count);
				break;
			}
		}
		System.out.println(s);
	}
}
