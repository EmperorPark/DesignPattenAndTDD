package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfoFromDB() {
		System.out.println("Get HP Potion info from database.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("Insert HP Potion getting info to database. " + new Date());		
	}

	/** 
	 * @return HpPotion
	 * @see framework.ItemCreator#createItem()
	 */
	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
