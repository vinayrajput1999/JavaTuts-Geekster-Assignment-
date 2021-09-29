import java.util.*;
public class AscendArray {
	
	public static void main(String[] args) {
		int check;
		boolean flag = true;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the elements of array ");
		for(int i=0;i<5;i++) {
			
			arr[i] = s.nextInt();
			
		}
		for(int i=0;i<5-1;i++) {
			check = arr[i+1];
			if(arr[i]>check) {
				flag = false;
				break;
			}
		}
		if(flag==false) {
		System.out.println("FALSE");
	}
		else {
			System.out.println("TRUE");
		}

    }
}

