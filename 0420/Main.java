public class Main {
		public static void main(String[] args) {
				try{ 
						System.out.println("item num: " + Integer.parseInt(args[0]));
						System.out.println("answer range: " + Integer.parseInt(args[1]));
				} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("usage: java HitAndBlow <item_num> <answer_range>");
						System.exit(-1);	
				}
				int item_num = Integer.parseInt(args[0]);
				int answer_range = Integer.parseInt(args[1]);

				if(item_num > answer_range) {
						System.out.println("error: item_num must be less than answer_num.");
						System.exit(-1);
				}
				String answer_str = HitAndBlow_Random.output_answer_str(item_num, answer_range);
				HitAndBlow_Compare cmp = new HitAndBlow_Compare(item_num);
				while(true) {
						System.out.print(item_num + "個の数字パターンを入力してください: ");
						String input_str = HitAndBlow_IO.input_str();
						if(answer_str.equals(input_str)) {
								System.out.println("Hit: 5 Blow: 0");
								System.out.println("あなたの勝ちです!!");
								System.exit(0);
						} else if(input_str.equals("h")) {
								HitAndBlow_IO.output_history();	
								continue;
						}
						cmp.check_HitAndBlow(input_str, answer_str);
						System.out.println("Hit: " + cmp.hit_num + " Blo: " + cmp.blow_num);
				}
		}
}
