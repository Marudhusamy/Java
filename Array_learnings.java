package Array_Package;

public class Array_learnings {

	public static void main(String[] args) 
	{
		Array_learnings al=new Array_learnings();
		al.fint_highestno();
		al.fint_min_value();
		al.fint_Total();
		al.fint_max_secondmax();
		
		
		
		// TODO Auto-generated method stub
		
	}

	private void fint_max_secondmax() {
		// TODO Auto-generated method stub
		int[] marks= {67,89,90,86,98,96};
                    //0  1  2  3   4  5
		int first=marks[0],second=marks[0];
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>first)
			{
				second=first;
				first=marks[i];
			}
			else if(marks[i]>second)
			{
				second=marks[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		
	}

	private void fint_Total() {
		// TODO Auto-generated method stub
		int [] marks= {33,55,77,90,67};
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		System.out.println(total);
	}

	private void fint_min_value() {
		// TODO Auto-generated method stub
		int [] marks= {22,78,-98,65,46};
		             //0, 1, 2  3   4
		int min=marks[0];//67
		for(int i=1;i<marks.length;i++)
		{
			if(marks[i]<min)
			{
				min=marks[i];
			}
			
		}
		System.out.println(min);
		
		
	}

	private void fint_highestno() {
		// TODO Auto-generated method stub
		int [] marks= {100,78,98,65,46};
		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				max=marks[i];
			}
			
		}
		System.out.println(max);
		
		
	}

}
