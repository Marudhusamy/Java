package oprator;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=2;
		while(no<=10)
	{
			System.out.print(no+" " );
			no=no+2;
		}
		System.out.println(" ");
		int no1=3;
		while(no1<=15)
		{
			System.out.print(no1+" " );
			no1=no1+3;
	     }
		System.out.println(" ");
		int n = 1;  
	        int currentNumber = 3;
	        
	        while (currentNumber <= 48) 
	        {
	            System.out.print(currentNumber + ", ");
	            n++;
	            currentNumber = n * n - 1;
	        }
	        
	        // Predicting the missing number
	        System.out.println("\nThe missing number is: " + (n * n - 1));
	    }	
	}
