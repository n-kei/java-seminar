public class HitAndBlow_nDigit throws Exception {
	private int[] digits;
	private int digitNum = 0;

	public HitAndBlow_nDigit(String digit_str, char separator) {
		String[] digits_str = digit_str.split("\s", 0);
		digits = new int[digits_str.length()];
		for(int i = 0; i < digits.length(); i++) {
			digits[i] = Integer.parseInt(digits_str[i]);
		}
	}

	public int getDigitNum(){ return digitNum;}
	public int[] getDigits(){return digits;}	

	public int hit(HitAndBlow_nDigit digit) {
		int hitNum = 0;

		for(int i = 0; i < digit.getDigitNum(); i++) {
			if(this.digits[i] == digit.getDigits()[i]) {
				hitNum++;		
			}
		}
		return hitNum;
	}

	public int blow(HitAndBlow_nDigit digit) {
		int blowNum = 0;

		for(int i = 0; i < digit.getDigitNum(; i++){  
			for(int j = 0; j < digit.getDigitNum() - 1; j++) {
				if(i == j)
					continue;

				if(digit.getDigits()[i] == digits[j]) {
					blowNum++;	
					break;
				}
			}
		}
		return blowNum;
	}
}
