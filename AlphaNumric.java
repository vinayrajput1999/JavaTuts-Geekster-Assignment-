import java.util.Scanner;
public class AlphaNumric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
        String str = sc.next();
        sc.close();
		boolean c = false, intgr = false;
		for (int i = 0; i < str.length(); i++) {
			if(c && intgr) {
				break;
			}
			if(c == false)
			c = isChar(str.charAt(i));
			
			if(intgr == false)
			intgr = isInt(str.charAt(i));
		}
		if(c && intgr) {
			System.out.println("This string is Alpha Numeric");
		}else {
			System.out.println("This string is Not Alphanumeric");
		}
	}
	
	public static boolean isChar(char ch) {
		
		if((ch >= 'a'
		&& ch <= 'z')
		|| (ch >='A'
		&& ch <= 'Z')) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isInt(char ch) {
		if(ch >='0' && ch <='9') {
			return true;
		}
		
		return false;
	}
}
