package AdapterPattern;

public class Main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImplement();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
		
		System.out.format("%13.8f\n" ,adapter.twiceOf(100f));
		System.out.format("%13.8f\n",adapter.halfOf(100f));
		
	}
}
