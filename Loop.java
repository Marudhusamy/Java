package oprator;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop lp= new Loop();
		lp.sum_digits();
		lp.flowers_count();
		lp.factorial(5);
		lp.find_diveiser(100);
	int diveiser_count=lp.change_diveiser(100);
	if(diveiser_count==0)
		{
			System.out.println("prime number");
			
		}
		else
		{
			System.out.println("Not prime number");
		}

	}

	private void sum_digits() {
		// TODO Auto-generated method stub
		int no=7864;
		int sum=0;
		int rem=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			//rem=no%10;
			sum=sum+rem;
			
		}
		System.out.println(sum);
		
	}

	private int change_diveiser(int no) {
		// TODO Auto-generated method stub
		;
		int div=2;
		int count=0;
		System.out.println("Diveiser" + no + " is:");
		while(div<=no/2)
		{
			if(no%div==0)
			{
				System.out.print(div + " ");
			
				count++;
			}
				div++;
			}
		
	
		System.out.println(" ");
		System.out.println("count of diveiser" + count);
		return count;
	}
	
		
	

	private void find_diveiser(int no) {
		// TODO Auto-generated method stub
		int div=1;
		System.out.println("Diveiser " + no +" is :");
		while(div<=100)
		{
			if(no%div==0)
				System.out.print(div + " ");
			div++;
			
	}
   System.out.println(" ");
		
	}

	private void factorial(int fact)
	{
		// TODO Auto-generated method stub
		int result=1;
		int no=1;
		while(no<=fact)
		{
			result=result*no;
			no++;
		}
		System.out.println("factorial of " + fact + " is " + result);
	}

	private void flowers_count() {
		// TODO Auto-generated method stub
		int flowers_count=0;
		int temple=1;
		while(temple<=6)
		{
			flowers_count=flowers_count+temple;
			temple++;
		}
		System.out.println("No of flowers:" + flowers_count );
	}


}
