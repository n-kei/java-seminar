import java.util.Random;

public class HitAndBlow_Answer {
		private int answerNum = 0;
		private int answerRange = 0;

		public HitAndBlow_Answer (int answerNum, int answerRange) 
				throws ElementNumberMissingException {
				if(answerNum > answerRange) {
						throw new ElementNumberMissingException("error: item num must be less than answer num.");
				}
				this.answerNum = answerNum;
				this.answerRange = answerRange;
		}

		public HitAndBlow_nDigit getAnswer() throws Exception{
				HitAndBlow_nDigit digit = null;
				Random rnd = new Random();
				String answer_str = new String();
				for(int i = 0; i < this.answerNum;) {
						int rand_num;

						rand_num = rnd.nextInt(this.answerRange);
						if(answer_str.indexOf(String.valueOf(rand_num))== -1) {
								answer_str = answer_str + String.valueOf(rand_num) + " ";
								i++;
						}
				}
				answer_str = answer_str.trim();
				digit = new HitAndBlow_nDigit(answer_str, " ");
				return digit;
		}
}
