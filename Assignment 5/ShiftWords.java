
public class ShiftWords {
	
	public static void main(String[] args) {
		String str = "Geekster is my class room";
		
		String[] strArr = str.split(" ");
		int n = strArr.length;
		
		String revInput = "";
		for(int i = n-1; i>-1; i--) {
			revInput += strArr[i]+ " "; 
		}
		
		System.out.println(revInput);	
	}
}
