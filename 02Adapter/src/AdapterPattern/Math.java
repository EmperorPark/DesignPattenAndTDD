package AdapterPattern;

/**
 * Basic Math Class(Example)</br>
 * double return
 * @author user
 *
 */
public class Math {
	
	public double twoTime(double num) {
		return num * 2;
	}
	
	public double half(double num) {
		return num / 2;
	}
	
	//Additional requirement on the supposition
	public Double doubled(Double num) {
		return num * 2;
	}
}
