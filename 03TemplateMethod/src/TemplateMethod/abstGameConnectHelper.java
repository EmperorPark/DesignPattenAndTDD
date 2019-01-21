package TemplateMethod;

/**
 * Define a process in this class</br>
 * The implementation of each method is in the subclass</br> 
 * If there is a requirement change, modify the subclass
 * @author woghkd0719
 *
 */
public abstract class abstGameConnectHelper {

	protected abstract String doSecurity(String encodestr);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String Connection(String info);
	
	/**
	 * Game Connection Template Method
	 * @param str
	 * @return GameConnectionString
	 */
	public String requestConnection(String encodestr) {
		
		String decodeStr = doSecurity(encodestr);
		
		// parse decodeStr
		String id = decodeStr;
		String pwd = decodeStr;
		
		if(!authentication(id, pwd)) {
			throw new Error("ID or PW is not correct");
		}
		
		// parse decodeStr
		String userName = decodeStr;
		int autho = authorization(userName);
		
		switch (autho) {
		case -1://Game Manager
			throw new Error("you can not access!");
		case 0://Game Manager
			System.out.println("authorization : Game Manager");
			break;
		case 1://Paid member
			System.out.println("authorization : Paid member");		
			break;
		case 2://Free member
			System.out.println("authorization : Free member");
			break;
		case 3://No authorization
			System.out.println("No authorization");
			break;
		default:
			
			break;
		}
		
		return Connection(decodeStr);
	}
	
}
