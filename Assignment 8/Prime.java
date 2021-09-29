import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    
        sc.close();
    
        for (int j = 2; j <= a; j++) {
            boolean fa = false;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    fa = true;
                    break;
                }
            }
            if (fa == false) {
                System.out.println(j);
            }
        }   
    
    }
}
