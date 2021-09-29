
public class PrimeNumBetween {
	public static void main(String[] args) {
		System.out.println("Prime Numbers in range 15 to 80 are ");
		for(int i=15;i<=80;i++) {
			if(Prime(i)) {
				System.out.print(i+ "  ");
			}
		}
	}
	public static boolean Prime(int n) {
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			return true;
		}
		return false;
	}
}
