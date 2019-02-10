package Shape;

/**
 * Shape implements Cloneable to use clone() method
 * @author woghkd0719
 * @see java.long.Cloneable
 *
 */
public class Shape implements Cloneable {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	
}
