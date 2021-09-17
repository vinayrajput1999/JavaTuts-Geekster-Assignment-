
public class PrimeNum {
		
		public static void main(String[] args) {
			
			
			int num = 741;
			
			int mid = num/2;
			
			if(num == 0 || num == 1) {
				System.out.println("Not Prime.");
			}else {
				boolean flag = false;
				
				for(int i = 2; i <= mid; i++) {
					
					if(num % i == 0) {
						System.out.println("Not Prime");
						flag = true;
						break;
					}
					
					
				}
				
				if(flag == false){
					System.out.println("Prime");
				}
			}
			
		}

	}

