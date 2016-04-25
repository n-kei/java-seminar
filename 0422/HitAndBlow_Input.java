import java.util.Scanner;

public class HitAndBlow_Input {
	static String input_str = null;

	public static void input(){
		HitAndBlow_nDigit digit = null;
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		input_str = scan.next();
		input_str = input_str.trim();
	}

	public static String getString() {
		return input_str;
	}

	public static HitAndBlow_nDigit getNDigit() {
		HitAndBlow_nDigit digit = null;

		try {
			digit = new HitAndBlow_nDigit(input_str, " ");
		}catch (Exception e) {
			System.out.print("error: 入力された文字は不正です。");
			System.exit(-1);
		}
		return digit;
	}
}
