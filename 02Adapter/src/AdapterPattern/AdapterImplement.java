package AdapterPattern;

/**
 * Adapter inheritance
 * 
 * @author user
 *
 */
public class AdapterImplement implements Adapter {

	Math math = new Math();
	
	@Override
	public Float twiceOf(Float num) {
		
		//old
		//return (float) math.twoTime(num.doubleValue());
		
		//Additional requirement
		//not change another method
		return (float) math.doubled(num.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float num) {
		return (float) math.half(num.doubleValue());
	}

}
