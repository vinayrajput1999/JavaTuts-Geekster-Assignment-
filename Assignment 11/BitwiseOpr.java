
public class BitwiseOpr {

	public static void main(String[] args) {
			int a = 0;
			int arr[] = {4,6,6,4,2,3,3};
			for(int i = 0; i < arr.length; i++)
			{
				a = a^arr[i];
			}
			System.out.println(a);
			
			int b = 10;
			int k = 2;
			int mask = 1<<(k);
			
			b=b&mask;
		    int	c=b|mask;
		    
		    int d = ~b&mask;
			
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		}
	}

    


