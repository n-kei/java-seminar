import java.util.Scanner;

public class HitAndBlow_Input {
	static String input_str = null;

	public static void input() throws ElementOverlapException {
		String tmp;
		Scanner scan = new Scanner(System.in);

		scan.useDelimiter("\n");
		input_str = scan.next();
		input_str = tmp = input_str.trim();
		if(checkStringOverlap(tmp)){
			throw new ElementOverlapException("error: inputed elements are overlapping.");
		}
	}

	public static String getString() {
		return input_str;
	}

	public static HitAndBlow_nDigit getNDigit() throws Exception {
		HitAndBlow_nDigit digit = null;

		digit = new HitAndBlow_nDigit(input_str, " ");
		return digit;
	}

	private static boolean checkStringOverlap(String str) {
		if(str.length() == 1)
			return false;
		for(int i = 1; i < str.length() - 1; i++) {
			if(str.charAt(0) == str.charAt(i))
				return true;
		}
		String tmp = new String();
		for(int i = 1; i < str.length() - 1; i++) {
			tmp += str.charAt(i); 
		}
		return checkStringOverlap(tmp);
	}
}
