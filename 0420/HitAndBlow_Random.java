import java.util.Random;

public class HitAndBlow_Random {
		public String output_answer_str(int item_num, int answer_range) {
				String answer_str = new String();
				Random rnd = new Random();

				for(int i = 0; i < item_num;) {
						int rand_num;
						
						rand_num = rnd.nextInt(answer_range);
						if(answer_str.indexOf(String.valueOf(rand_num)) == -1) {
								answer_str = answer_str + String.valueOf(rand_num) + " ";
								i++;
						}

				}
				answer_str = answer_str.trim();

				return(answer_str);
		}
}
