import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            
            int num = sc.nextInt();
            int odd = 0, even = 0;
            int digit = 0;
            sc.close();
        
            while (num > 0) {
                boolean falg = false;
                digit = num % 10;
                if (digit == 0 || digit == 1) {
                    odd += digit;
                }else {
                    if (digit % 2 == 0) {
                        falg = true;
                    }
                    
                    if (falg == true) {
                        even += digit;
                    } else {
                        odd += digit;
                    }
                }
                num = num / 10;
            }
        System.out.println(even+" "+odd);
        
    }
}
