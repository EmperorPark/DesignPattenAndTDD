package StrategyPattern;

/**
 * GameCharacter Action
 * @author user
 *
 */
public class GameCharacter {
	
	//접근점
	private Weapon weapon;
	
	//교환가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	/**
	 * Character attack
	 * @see Weapon
	 */
	public void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
		}else {
			//델리게이트
			weapon.attack();			
		}


	}
}
