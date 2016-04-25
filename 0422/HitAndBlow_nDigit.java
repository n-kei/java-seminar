public class HitAndBlow_nDigit {
		private int[] digits;
		private int digitNum = 0;
		private	int hitNum = 0;
		private int blowNum = 0;

		public HitAndBlow_nDigit(String digit_str, String separator)
				throws Exception {
				String[] digits_str = digit_str.split(separator, 0);
				digits = new int[digits_str.length];
				for(int i = 0; i < digits.length; i++) {
						digits[i] = Integer.parseInt(digits_str[i]);
				}
				digitNum = digits.length;
		}

		public int getHitNum(){return hitNum;}
		public int getBlowNum(){return blowNum;}
		public int getDigitNum(){ return digitNum;}
		public int[] getDigits(){return digits;}	

		public int hit(HitAndBlow_nDigit digit) throws Exception {
				if(digit.getDigitNum() != this.digitNum){
						throw new ElementNumberMissingException("入力された数列と要素数が一致しません"); 
				} 

				for(int i = 0; i < digit.getDigitNum(); i++) {
						if(this.digits[i] == digit.getDigits()[i]) {
								hitNum++;		
						}
				}
				return hitNum;
		}

		public int blow(HitAndBlow_nDigit digit) throws Exception {
				if(digit.getDigitNum() != this.digitNum){
						throw new ElementNumberMissingException("入力された数列と要素数が一致しません"); 
				} 

				for(int i = 0; i < digit.getDigitNum(); i++){  
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

		public void print() {
				for(int i = 0; i < this.digitNum; i++) {
						System.out.print(this.digits[i] + " ");
				}
				System.out.println();
		}

}

