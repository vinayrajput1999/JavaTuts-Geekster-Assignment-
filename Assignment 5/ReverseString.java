import java.util.*;
public class ReverseString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  ");
		String str = sc.next();
		sc.close();
		
		String revStr = "";
		for(int i=str.length()-1; i>-1; i--) {
			char newChar = str.charAt(i);
			revStr = revStr + newChar;
		}
		System.out.println(revStr);
	}

}
