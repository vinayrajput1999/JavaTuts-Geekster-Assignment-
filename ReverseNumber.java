import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String[] args) {   
		
        // comment this out if you want to reverse a string
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		
		int rev=0;
        while(num>0){
            int t=num%10;
            rev=(rev*10)+t;
            num=num/10;
        }
        System.out.println("The reverse number is "+rev);
		
}
     //	(comment this out if you want to reverse a string)
//	 Sytem.out.println("Enter the string ");
//	 String str=sc.next();   
//	 String reverse="";
//	 
//	 for(int i=str.length()-1;i>=0;i--){
//	        reverse=reverse+str.charAt(i);
//	    }
//
//	    System.out.println("The reverse number is "+reverse);
//
//	}
}
	
	
	


