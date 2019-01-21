package StrategyPattern;

/**
 * GameCharacter Action
 * @author user
 *
 */
public class GameCharacter {
	
	//������
	private Weapon weapon;
	
	//��ȯ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	/**
	 * Character attack
	 * @see Weapon
	 */
	public void attack() {
		if (weapon == null) {
			System.out.println("�Ǽ� ����");
		}else {
			//��������Ʈ
			weapon.attack();			
		}


	}
}
