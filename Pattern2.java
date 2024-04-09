package loop;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Pattern2 pt= new Pattern2();
    pt.pattern1();
    pt.pattern2();
    pt.pattern3();
    pt.char_pattern4();
    pt.box_pattern();
    
    
    
    
     
	}

	private void box_pattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=6;row++)
		{
			for(int col=1;col<=6;col++)
			{
				if(row==1 || row==6)
				System.out.print("* ");
				else
				{
					if(col==1 || col==6)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

	private void char_pattern4() {
		// TODO Auto-generated method stub
		for(char row='A';row<='E';row++)
		{
			for(char col='A';col<=row;col++)
			{
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<6-row;col++)
				        // col<6-row and col<=5-row both same
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");
				//col,row,6-row,6-col,row+col-1,no++
			}
			
			System.out.println();
		}
		
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		int no=1;
		
				for(int row=1;row<=5;row++)
				{
					for(int col=1;col<=6-row;col++)
					{
						System.out.print(no+"\t");
						no++;
					}
					
					System.out.println();
				}
				
		
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=6-row;col++)
			{
				System.out.print(col+" ");
			}
			
			System.out.println();
		}
		
	}

}
