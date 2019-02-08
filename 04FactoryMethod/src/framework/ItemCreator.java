package framework;

/**
 * @author user
 * this class contain the factory method 
 */
public abstract class ItemCreator {
	
	/**
	 * factory method
	 * @return Item
	 * @see Item
	 */
	public Item create() {
		Item item;
//		step1
		requestItemInfoFromDB();
//		step2
		item = createItem();
//		step3
		createItemLog();
		
		return item;
	}
	
	/**
	 * Requests information from DB Before Creating items
	 */
	abstract protected void requestItemInfoFromDB();
	
	/**
	 * item creation log
	 */
	abstract protected void createItemLog();
	
	/**
	 * item creation
	 * @return Item
	 * @see Item
	 */
	abstract protected Item createItem();
}
