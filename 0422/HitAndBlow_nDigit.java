public class HitAndBlow_nDigit {
		private int[] digits;
		private int digitNum = 0;
		private String HitStr;

		public HitAndBlow_nDigit(String digit_str, String separator)
				throws Exception {
				String[] digits_str = digit_str.split(separator, 0);
				digits = new int[digits_str.length];
				for(int i = 0; i < digits.length; i++) {
						digits[i] = Integer.parseInt(digits_str[i]);
				}
				digitNum = digits.length;
		}

		public String getHitNum(){return HitStr;}
		public int getDigitNum(){ return digitNum;}
		public int[] getDigits(){return digits;}	

		public int hit(HitAndBlow_nDigit digit) throws Exception {
				int hitNum = 0;
				if(digit.getDigitNum() != this.digitNum){
						throw new ElementNumberMissingException("入力された数列と要素数が一致しません"); 
				} 

				for(int i = 0; i < digit.getDigitNum(); i++) {
						if(this.digits[i] == digit.getDigits()[i]) {
								hitNum++;		
						}
				}
				HitStr = String.valueOf(hitNum);
				return hitNum;
		}

		public int blow(HitAndBlow_nDigit digit) throws Exception {
				int blowNum = 0;
				if(digit.getDigitNum() != this.digitNum){
						throw new ElementNumberMissingException("入力された数列と要素数が一致しません"); 
				} 

				for(int i = 0; i < digit.getDigitNum(); i++){  
						for(int j = 0; j < digit.getDigitNum(); j++) {
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

