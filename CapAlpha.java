import java.util.Scanner;
public class CapAlpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		sc.close();
		String a = "";
		for(int i=0; i<str.length(); i++) {
			a += captialize(str.charAt(i));
		}
		System.out.println(a);
		
	}
	public static String captialize(char ch) {
		String str = "";
		if((ch >= 'a'
				&& ch <= 'z')){
			str+= Character.toString(Character.toUpperCase(ch));	
		}else {
			str += Character.toString(ch);
		}
		
		return str;	
	}
}
