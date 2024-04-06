package loop;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic lc = new Logic();
		lc.Swapping();
		lc.Swapping_no_tempvalue();
		lc.fibonacci();
		lc.fibonacci_no_third_variable();
		lc.binary_to_decimal();
		int no=5;
		while(no>=1)
		{
		int result=lc.find_power(no,no-1);
		System.out.println("box value is:"+result);
		no--;
		}
		
		
		

	}

	private void binary_to_decimal() {
		// TODO Auto-generated method stub
		int no=111;
		int decimal=0;
		int power=0;
		while(no>0)
		{
			int rem=no%10;
			decimal=decimal+(rem*(find_power(2,power)));
			no=no/10;
			power++;
		}
		System.out.println(decimal);
		
	}

	private int find_power(int base, int power) {
		// TODO Auto-generated method stub

		int box=1;
		while(power>0)
		{
			box=box*base;
			power--;
			
		}
		//System.out.println(box);
		return box;
		
	}

	private void fibonacci_no_third_variable() {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		while(first<=13)
		{
			System.out.println(first);
			second=first+second;
			first=second-first;
			

		}
		
	}

	private void fibonacci() {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		
		System.out.println(first);
		while(first<=13)
		{
			System.out.println(first);
			third=first+second;
			first=second;
			second=third;

		}
		

		
	}

	private void Swapping_no_tempvalue() {
		// TODO Auto-generated method stub
		int no1=100,no2=200;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1 + " "+ no2);
		
	}

	private void Swapping() {
		// TODO Auto-generated method stub
		int no1=100;
		int no2=200;
		System.out.println(no1 + " "+ no2);
		int temp=no1;
		no1=no2;
		no2=temp;
		System.out.println(no1 + "  "+ no2);
		
		
	}

}
