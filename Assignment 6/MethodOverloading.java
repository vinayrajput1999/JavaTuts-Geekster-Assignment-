
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		add(5,6);
		
		add(3.5 , 3.8);
		
		add(true, false);
		
		add(true, 6);
		
		add(1,5,6);
		
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b) {
		
		System.out.println(a+b);
	}
	public static void add(boolean x, boolean y) {
		System.out.println(x +" "+ y);
	}
	public static void add(boolean x, int y) {
		System.out.println(x +" "+ y);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	

}
