package Array_Package;

public class Array_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_logic al= new Array_logic();
		al.Bubble_Short();
		al.Binary_Search();
		al.Frequency();
		al.letter_more_one();
        al.Only_once();
		al.Highest_char();
	}

	private void Highest_char() {
		
		//Highest occurring character in given String: 
		String name = "people";
				             //012
				int high =0;
				char high_char = ' '; 
				char[] ch = name.toCharArray();
		for(int j =0; j<ch.length; j++)
		{
				char letter = ch[j]; //letter = a j = 2
				int count = 0; 
			for(int i=0; i<ch.length;i++)// i = 0
				{
					if(letter == ch[i]) //j = 2 i = 0
					{
						if(j<=i)
							count++; //count = 2
						else 
						{
							count =0; 
							break;
						}
					}
				}
				if(count!=0)
				{
					if(count>high)
					{
						high = count; 
						high_char = letter; 
					}
				}
		}
		System.out.println(high_char + " appeared "+ high + " no of times");
		}
	

	private void Only_once() {
		
		//Only Once 

				String name = "payilagam";
				             //012
				char[] ch = name.toCharArray();
		for(int j =0; j<ch.length; j++)
		{
				char letter = ch[j]; //letter = a j = 2
				int count = 0; 
			for(int i=0; i<ch.length;i++)// i = 0
				{
					if(letter == ch[i]) //j = 2 i = 0
					{
						if(j<=i)
							count++; //count = 2
						else 
						{
							count =0; 
							break;
						}
					}
				}
			if(count==1)
				System.out.println(letter + " appeared "+ count + " time(s)");
		}
		
	}

	private void letter_more_one() {
		
		//Letters appeared more than once:

			String name = "payilagam";
			             //012
			char[] ch = name.toCharArray();
	for(int j =0; j<ch.length; j++)
	{
			char letter = ch[j]; //letter = a j = 2
			int count = 0; 
		for(int i=0; i<ch.length;i++)// i = 0
			{
				if(letter == ch[i]) //j = 2 i = 0
				{
					if(j<=i)
						count++; //count = 2
					else 
					{
						count =0; 
						break;
					}
				}
			}
			if(count>1)
			System.out.println(letter + " appeared "+ count + " time(s)");
	}
		
	}

	private void Frequency() {
		//Program for frequency of each character:
		// TODO Auto-generated method stub
		String name = "chennai";
        //012
char[] ch = name.toCharArray();
for(int j =0; j<ch.length; j++)
{
char letter = ch[j]; //letter = a j = 2
int count = 0; 
for(int i=0; i<ch.length;i++)// i = 0
{
if(letter == ch[i]) //j = 2 i = 0
{
	if(j<=i)
		count++; //count = 2
	else 
	{
		count =0; 
		break;
	}
}
}
if(count!=0)
System.out.println(letter + " appeared "+ count + " time(s)");
}	
	}

	private void Binary_Search() {
		// TODO Auto-generated method stub
		int[] ar= {10,12,16,49,98};
		int key=100;
		int min=0 ,max =ar.length-1;
		while(min<=max) 
		{ 
			 int mit=(min+max)/2;
		     if(key==ar[mit])
		     {
		    	 System.out.println("yes i fond at " + mit);
		    	 break;
		     }
		     else if(key>ar[mit])
		     {
		    	 min=mit+1;
		     }
		     else
		     {
		    	 max=mit-1;
		     }
		    	 
		}
		if(min>max)
		{
			System.out.println("key is not found");
		}
		
	}

	private void Bubble_Short() {
		// TODO Auto-generated method stub
		int[] ar = { 87, 65, 35, 76 };
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");
		System.out.println();
		for (int j = 1; j < ar.length; j++) {
			for (int i = 0; i < ar.length - j; i++) {
				if (ar[i] > ar[1 + i]) {
					int temp = ar[i];
					ar[i] = ar[1 + i];
					ar[1 + i] = temp;
				}

			}
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");

	}
}
