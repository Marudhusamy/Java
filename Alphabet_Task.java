package Loop_practice;

public class Task3 {
public static void main(String args[])
{
	Task3 tk= new Task3();
	tk.print_H();
	tk.print_W();
   tk.Print_M();
	tk.print_A();
	tk.print_D();
	tk.print_U();
	tk.print_R();
	tk.My_Name();
	
	
	
	
	
	
	
	
	
}

private void My_Name() {
	// TODO Auto-generated method stub
	Print_M();
	
	print_A();
	System.out.println();
	print_R();
	System.out.println();
	print_U();
	System.out.println();
	print_D();
	System.out.println();
	print_H();
	System.out.println();
	print_U();
	System.out.println();
	
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

private void print_U() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(col==1 || col==7 || row==7)
			{
				if((col==1 && row==7)|| (col==7 && row==7))
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

private void print_D() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(row==1 || row==7 || col==1 || col==7)
			{
			
				if((row==1 && col==7) || (row==7 && col==7))
					System.out.print(" ");
				else 
					System.out.print("* ");
			}
			
			else 
				System.out.print("  ");
		}
		
		System.out.println();
	}
	
}

private void print_A() {
	// TODO Auto-generated method stub
	Print_M();
	System.out.println();
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(row==1)
			{
				if(col==1 || col==7)
					System.out.print("  ");
					else
						System.out.print("* ");
				}
			else
			{
				if(col==1 || col==7 || row==5)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			
		}
		System.out.println();
	}
}

private void Print_M() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(col==1 || col==7)
			System.out.print("* ");
			else if((row==col && col<=4) ||(row+col==8 && row<=4))
				System.out.print("* ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
	
}

private void print_W() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7; row++)
	{
		for(int col=1;col<=14;col++)
		{
			if((row==col && col<=4) || (row+col==8 && row<=4))
				  System.out.print("* ");   
			else if (col-row==7 && col<=11 || row+col==15 && row<=4)
				   System.out.print("* ");
				   else 
					   System.out.print("  ");
				
				
		
				}
		System.out.println();
	}
	
}

private void print_H() {
	// TODO Auto-generated method stub
	for(int row=1;row<=7;row++)
	{
		for(int col=1;col<=7;col++)
		{
			if(col==1 || col==7 || row==4)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	
}

}
