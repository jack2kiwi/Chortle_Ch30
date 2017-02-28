
public class HelloObject {
	String greeting;
	String greeting2;
	
	public HelloObject(String string, String string2) {
		greeting = string;
		greeting2 = string2;
	}
	
	public HelloObject(String string) {
		greeting = string;
	}

	void speak() {
	    System.out.println(greeting);
	}
	
	void speak2() {
		System.out.println(greeting2);
	}
	
	void speakRepeat() {
		for(int i = 0; i < greeting.length(); i++) {
			System.out.println(greeting);
		}
	}
	
	
}
