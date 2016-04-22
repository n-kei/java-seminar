import java.util.Scanner;
import java.util.ArrayList;

public class HitAndBlow_IO {
		private static ArrayList<String> history_list = new ArrayList<String>();

		public static String input_str() {
				Scanner scan = new Scanner(System.in);
				scan.useDelimiter("\n");
				String input_str = scan.next();
				history_list.add(input_str);
				return(input_str);
		}

		public static void output_history() {
				System.out.println("----------History----------");
				for(int i = 0; i < history_list.size(); i++) {
						System.out.println(history_list.get(i));
				}	
		}
}
