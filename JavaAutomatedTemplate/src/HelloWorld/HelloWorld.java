package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(getHello() + getComma() + getWorld() + getExclamation());
		System.out.println("Hello, Everything!");
	}
	
	public static String getHello() {
		return "Hello";
	}
	
	public static String getComma() {
		return ", ";
	}
	
	public static String getWorld() {
		return "World";
	}
	
	public static String getExclamation() {
		return "!";
	}

}
