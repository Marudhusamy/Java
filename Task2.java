package loop;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Task2 tk= new Task2();
            tk.perfect_number();
            tk.neon_number();
            
	
	
	}

	private void neon_number() {
		// TODO Auto-generated method stub
		int no=9;
		int sum=0;
		int sqr=no*no;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
			
		}
		System.out.println(sum);
		if(no==sum)
		{
			System.out.println("neon number");
			
		}
		else
		{
			System.out.println("not neon number");
		}
		
	}

	private void perfect_number() {
		// TODO Auto-generated method stub
		int no=28;
		int perfect=0;
		int i=1;
		while(i<=no/2)
		{
			if(no%i==0)
			perfect=perfect+i;
			i++;
		}
		System.out.println(perfect);
		if(no==perfect)
		{
			System.out.println("given number is perfect");
			
		}
		else
		{
			System.out.println("given numberis not perfect");
			
		}
		
	}

}
