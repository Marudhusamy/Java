package loop;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet_Pattern p = new Alphabet_Pattern();
		p.print_matrix();
		p.print_I();
		p.print_C();
		p.print_D();
		p.print_P();
		p.print_R();
		p.print_R1();
		p.print_B();
		p.print_N();
		p.print_Z();
		p.print_X();
		p.print_Y();
		
		
		
		
		
		

	}

	private void print_Y() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==col) 
				{ 
					if(row<=4 || col<=4)
					System.out.print("* ");
					else
						System.out.print("  ");
				}
				
				else 
					{
					if(row+col==8)
					
					System.out.print("* ");
				else
					System.out.print("  ");
					}
			}
			System.out.println();
		}
		
	}

	private void print_X() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==row || col+row==8)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_Z() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || row==7 || row+col==8)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_N() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1 || col==7 || row==col)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_B() {
		// TODO Auto-generated method stub
		print_D();
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row!=7)
				{
					if(col==1 || col==7)
						System.out.print("* ");
					else
						System.out.print("  ");
			
				}
				else
				{
					if(col!=7)
						System.out.print("* ");
					else
						System.out.print("  ");
					
				}
			
			}
			System.out.println();
		}
		
	}

	private void print_R1() {
		// TODO Auto-generated method stub
		print_D();
		
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1)
				System.out.print("* ");
				else if(row==col)
				 System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_R() {
		// TODO Auto-generated method stub
		print_D();
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1 || col==7)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_P() {
		// TODO Auto-generated method stub
		print_D();
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(col==1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void print_D() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{ 
				if(row==1 || row==7)
				{
					if(col!=7)
						System.out.print("* ");
					else
						System.out.print("  ");
					
				}
				
				else if(col==1 || col==7)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

	private void print_C() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 || row==7 || col==1)
				{ 
					if(row==1 && col==1 || row==7 && col==1)
					System.out.print("  ");
					else
						System.out.print("* ");
				}
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

	private void print_I() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{  
				if(row==1 || row==7 || col==4)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		
	}

	private void print_matrix() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
