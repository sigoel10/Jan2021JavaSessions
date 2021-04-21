package javaSessions;

public class Window {
	
	@Override
	public void finalize() {
			System.out.println("finalizeMethod ------- window");
	}
}
