package stringpgms;

public class StrRevLetter {

	public static void main(String[] args) {
		String input = "1ab2";
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			if (!Character.isDigit(charArray[left])) {
			//if (!Character.isLetter(charArray[left])) {
				left++;

			}else if (!Character.isDigit(charArray[right])) {
			//else if (!Character.isLetter(charArray[right])) {
				right--;
			
				
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}

	System.out.println(charArray);
}

}
