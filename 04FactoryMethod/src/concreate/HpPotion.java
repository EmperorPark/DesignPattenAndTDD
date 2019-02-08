package concreate;

import framework.Item;

public class HpPotion implements Item {
	@Override
	public void use() {
		System.out.println("HP recovery");
	}
}
