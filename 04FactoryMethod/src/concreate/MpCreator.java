package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemInfoFromDB() {
		System.out.println("Get MP Potion info from database.");
	}

	@Override
	protected void createItemLog() {
		System.out.println("Insert MP Potion getting info to database. " + new Date());		
	}

	/** 
	 * @return MpPotion
	 * @see framework.ItemCreator#createItem()
	 */
	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
