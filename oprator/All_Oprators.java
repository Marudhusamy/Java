package oprator;

public class All_Oprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Arithmetic Operators
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
//		Unary Operators
		
		//	++Increment operator; increments a value by 1
		int num=10;        //10    12      12
		System.out.println(num++ + ++num + num++);
		System.out.println(num);
		 
		//--Decrement operator; decrements a value by 1
		int numr=10;
		System.out.println(--numr  +  numr--   +  --numr);
		System.out.println(numr);
		
		// !Logical complement operator; inverts the value of a boolean
         
		int c=10,d=20;
		if(c!=d) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		//Equality and Relational Operators
		
		int val1=10;
		int val2=20;
		//==      Equal to
		if(val1==val2)
		{
			System.out.println("bothe values are equal");
		}
		else
		{
			System.out.println("bothe values are not equal");
		}
		//!=      Not equal to
		int e=10,f=20;
		if(e!=f) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		//>       Greater than
		if(val1>val2)
		{
			System.out.println("val1 is grater than val2");
		}
		else
		{
			System.out.println("val1 is not grater than val2");
		}
	
//>=      Greater than or equal to
		
		if(val1>=val2)
		{
			System.out.println("val1 is grater than or equal val2");
		}
		else
		{
			System.out.println("val1 is not grater than or equal val2");
		}
		//<       Less than
		if(val1<val2)
		{
			System.out.println("val1 is less than val2");
		}
		else
		{
			System.out.println("val1 is not less than val2");
		}
		//<=      Less than or equal to
		if(val1<=val2)
		{
			System.out.println("val1 is less than or equal val2");
		}
		else
		{
			System.out.println("val1 is not less than or equal val2");
		}
	
	}
	

}
