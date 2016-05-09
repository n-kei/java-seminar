public class HitAndBlow{
	public static void main(String[] args) throws Exception {
		try{ 
			System.out.println("item num: " + Integer.parseInt(args[0]));
			System.out.println("answer range: " + Integer.parseInt(args[1]));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("usage: java HitAndBlow <item_num> <answer_range>");
			System.exit(-1);	
		}

		int item_num = Integer.parseInt(args[0]);
		int answer_range = Integer.parseInt(args[1]);
		int hitNum = 0;
		int blowNum = 0;

		System.out.println("---------------HitAndBlow---------------");
		HitAndBlow_Answer answerGenerator = new HitAndBlow_Answer(item_num, answer_range);
		HitAndBlow_nDigit answer = answerGenerator.getAnswer();
		System.out.println("answer:");
		answer.print();
		do {
			HitAndBlow_nDigit input;
			System.out.print(item_num + "個の数字を入力シてください：");
			HitAndBlow_Input.input();
			if(HitAndBlow_Input.getString().equals("h")
					|| HitAndBlow_Input.getString().equals("history")){
				HitAndBlow_History.outputHistory();
				continue;
					}
			input = HitAndBlow_Input.getNDigit();
			hitNum = input.hit(answer);
			blowNum = input.blow(answer);
			HitAndBlow_History.saveHistory(input);
			System.out.println("Hit: " + hitNum + " Blow: " + blowNum);
		}while(hitNum != item_num);
	}

}
