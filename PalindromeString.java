import java.util.Scanner;
public class PalindromeString {
	
	public static void main(String[] args) {
	
//		comment this out for using next method
		
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String/Number ");
        String str=sc.nextLine();
        sc.close();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
            }

        if(str.equals(reverse)){
            System.out.println("The String is Palindrome ");
       }else{
            System.out.println("The String is not Palindrime");
        }
        
        int num,rev,a=0;
		System.out.println("Enter the String/Number  ");
		Scanner sc1=new Scanner(System.in);
		num=sc1.nextInt();
		int c=num; 
		while(num>0)
		{
		rev=num%10;
		a=(a*10)+rev;
		num=num/10;
		sc.close();
	}
		if(c==a)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}		
      
}

 
        
	
		        
