import java.util.Comparator;

public class HitAndBlow_nDigit_Comparator implements Comparator{
	public int compare(Object s, Object t) {
		return ((HitAndBlow_nDigit) s).getHitNum() - ((HitAndBlow_nDigit) t).getHitNum();
	}
	
}
