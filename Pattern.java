package loop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pn= new Pattern();
		pn.pattern1();
		pn.row_pattern();
		pn.col_pattern();
		pn.pattern2();//row type
		pn.pattern3();//col type
		pn.New_variable();//introduce a new variable
        pn.multiple_pattern();
        pn.pattern4();
        pn.pattern5();
        pn.pattern6();
        
        
		

	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
				
			}
			for(int col=1;col<=6-row;col++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(col+"\t");
			}
			System.out.print("* ");
			System.out.println();
		}
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print((row+col-1)+"\t");
			}
			System.out.println();
		}
		
	}

	private void multiple_pattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print((row*col)+"\t");
			}
			System.out.println();
			
		}
		
	}

	private void New_variable() {
		// TODO Auto-generated method stub
		int no=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(no+"\t ");
				no++;
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub 
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print((6-col)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print((6-row)+" ");
				        //row-val=6
				        //val=6-row
			}
			System.out.println();
		}
		
	}

	private void col_pattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void row_pattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
