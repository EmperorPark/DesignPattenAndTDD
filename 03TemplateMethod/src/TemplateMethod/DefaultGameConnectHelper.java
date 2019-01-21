package TemplateMethod;

public class DefaultGameConnectHelper extends abstGameConnectHelper {

	/** 
	 * Additional requirement : Enhanced Security Algorithm
	 * @see TemplateMethod.abstGameConnectHelper#doSecurity(java.lang.String)
	 */
	@Override
	protected String doSecurity(String encodestr) {
		//Original algorithm
		//System.out.println("decode");
		
		//Enhanced algorithm
		System.out.println("Enhanced decode Algorithm");
		return "decodeStr";
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("check ID & PW");
		//if(ID or PW not correct)return false;
		
		//hard coding
		return true;
	}

	/** Additional requirement : 19 years old or younger can not access after 10 o'clock.
	 * @see TemplateMethod.abstGameConnectHelper#authorization(java.lang.String)
	 */
	@Override
	protected int authorization(String userName) {
		//Account authorization query from Database
		System.out.println("Account authorization query");
		
		//if(UserAge(int) under 19 && now < 10:00) return -1;
		
		//hard coding
		return 0;
		//return -1;
	}

	@Override
	protected String Connection(String info) {
		System.out.println("Last connection sequence");
		return info;
	}

}
