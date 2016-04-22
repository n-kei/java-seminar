public class HitAndBlow_Compare {
	private int ItemNum;
	public static int hit_num;
	public static int blow_num;

	HitAndBlow_Compare(int item_num) {
		ItemNum = item_num;
		hit_num = 0;
		blow_num = 0;
	}	

	public static int get_hitNum() {
		return(hit_num);
	}

	public static int get_blowNum() {
		return(blow_num);
	}

	public void check_HitAndBlow(String input_str, String answer_str) {
		hit_num = blow_num = 0;
		
		for(int i = 0; i < ItemNum * 2 - 1;) {
			if(input_str.charAt(i) == ' ') {
				i++;
				continue;
			}
			if(answer_str.indexOf(input_str.charAt(i)) == i)
				hit_num++;
			else if(answer_str.indexOf(input_str.charAt(i)) >= 0)
				blow_num++;
			i++;
		}	
	}
}
