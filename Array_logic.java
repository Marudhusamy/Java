package Array_Package;

public class Array_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_logic al= new Array_logic();
		al.Bubble_Short();
		al.Binary_Search();

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
