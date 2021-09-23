
public class ReverseSentence {
	public static void main(String[]args) {
		
		String str = "Google is my goal";
		String[] strArr = str.split(" ");
		String rev = "";
		for(int i =0;i<strArr.length;i++) {
		rev = rev+RevStr(strArr[i]+" ");
		}
		System.out.println(rev);
	}
	
	public static String RevStr(String str) {
		String rev = "";
		for(int i=str.length()-1;i>-1;i--) {
			rev = rev + str.charAt(i);

		}
		return rev;
	}
}
