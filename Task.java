package Loop_practice;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tk= new Task();
		tk.sum_of_digits(23456);
	int no=6;
	 while(no>0)
	 {
		int result=tk.factorial(no);
		 System.out.println(no+" value of factorial " + result);
		 no--;
	 }	
	
		tk.common_divisor(100,120);
		int no1=5;
	while(no1>0)
		{
		int value=tk.find_power(no1,no1);
		no--;
		System.out.println(value);
		}
		
		
		int a=56;
        int b=37;
        int c=a+b;
System.out.println(c);
	
		

	}

	private void sum_of_digits(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		while(no>0)
		{
			sum=sum+(no%10);
			no=no/10;
		}
		System.out.println("sum of digits " + sum );
		if(sum>9) 
		{
			sum_of_digits(sum);
		}
	}

	private  int factorial(int no) {
		// TODO Auto-generated method stub
		//int no =5;
		int fact=1;
		while(no>0)
		{
			fact=fact*no;
			//System.out.println(fact);
			no--;
		}
		return fact;
		//System.out.println(fact);
		  
		
	}

	private void common_divisor(int no1, int no2) {
		int small= no1<no2 ? no1:no2;
		int div=2;
		int gcd=0;
		while(div<small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
				
				
				//System.out.println(div);
			}
		div++;
		//System.out.println(gcd);
		
		}
		System.out.println(gcd);
		
		// TODO Auto-generated method stub
		
	}

	private int find_power(int base,int power) {
		// TODO Auto-generated method stub
		
		int power1=6;
		int result=1;
		while(power>0)
		{
			result=result*base;
			power--;
			
		}
		//System.out.println(base + " power "+ power1 + " value is: " + result );
		return result;
	}

}
