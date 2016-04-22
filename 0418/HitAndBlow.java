import java.util.Scanner;
import java.util.Random;

public class HitAndBlow{
	public static void main(String[] args) {
		int hit_num = 0, blow_num = 0;
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
		System.out.println("---------------HitAndBlow---------------");

		Random rnd = new Random();
		String answer_str = new String();
		for(int i = 0; i < item_num;){
			int rand_num;

			rand_num = rnd.nextInt(answer_range);
			if(answer_str.indexOf(String.valueOf(rand_num)) == -1){
				answer_str = answer_str + String.valueOf(rand_num) + " ";
				i++;
			}
		}
		answer_str = answer_str.trim();

		while(true)
		{
			Scanner scan = new Scanner(System.in);
			scan.useDelimiter("\n");
			System.out.print(item_num + "個の数字パターンを入力してください: ");
			String input_str = scan.next();
			input_str = input_str.trim();
			System.out.println("answer: " + answer_str);
			if(answer_str.equals(input_str)) {
				System.out.println("Hit: 5 Blow: 0");
				System.out.println("あなたの勝ちです!!");
				System.exit(0);
			}

			for(int i = 0; i < item_num * 2 - 1;) { 
				try { 
					if(input_str.charAt(i) == ' ') {
						i++;
						continue;	
					}
					if(answer_str.indexOf(input_str.charAt(i)) == i)
						hit_num++;
					else if(answer_str.indexOf(input_str.charAt(i)) >= 0)
						blow_num++;
					i++;
				} catch(StringIndexOutOfBoundsException e){
					System.out.println("error: you are expected " + item_num + " inputs.");
					System.exit(-1);
				}
			}
			System.out.println("Hit: " + hit_num + " Blow: " + blow_num);
			hit_num = blow_num = 0;
		}
	}

}
