import java.util.Comparator;

public class HitAndBlow_nDigit_Comparator implements Comparator<HitAndBlow_nDigit>{
	public int compare(HitAndBlow_nDigit s, HitAndBlow_nDigit t) {
		return -( s.getHitNum() - t.getHitNum() );
	}
	
}
