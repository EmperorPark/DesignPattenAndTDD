import TemplateMethod.DefaultGameConnectHelper;
import TemplateMethod.abstGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		abstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("connnection String(encode)");
	}
}
