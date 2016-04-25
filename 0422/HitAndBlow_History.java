import java.util.*;

public class HitAndBlow_History {
		public static ArrayList<HitAndBlow_nDigit> history_list = new ArrayList<HitAndBlow_nDigit>();

		public static void saveHistory(HitAndBlow_nDigit saveNDigit) {
				history_list.add(saveNDigit);
		}

		public static void outputHistory(){
			//	Collections.sort(history_list);
				System.out.println("-------------------------History-------------------------");
				for(int i = 0; i < history_list.size(); i++) {
						for(int j = 0; j < history_list.get(i).getDigitNum(); j++) {
								System.out.print(history_list.get(i).getDigits()[j] + " ");
						}
						System.out.println(" ");
				}
				System.out.println("-------------------------History-------------------------");
		}
}
