
public class LargestNum {
public static void main(String[] args) {
		
		int[] arr = {19,52,51,300,93,87,666,91,6,287,7,50};
		
		if(arr.length > 0) {
			
			int max = arr[0];
			
			int i = 0;
			
			while(i < arr.length) {
				
				if(arr[i] > max) {
					max = arr[i];
				}
				
				i++;
				
			}
			System.out.println(max);
		}
	
	}

}
