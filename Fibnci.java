    import java.util.Scanner;
    
	public class Fibnci {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int a=0 ,b=1,c;
			System.out.print(a+" "+b);
			
			for(int i=2; i<num; i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.print(" "+c);
			}	
		}
	}