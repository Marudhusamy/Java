package String_learings;

public class String_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_logic sl= new String_logic();
		sl.strip_leading();
		

	}

	private void strip_leading() {
		// TODO Auto-generated method stub
	  String s1="   Hi how are you";
	  boolean first_letter=false;
			  for(int i=0;i<s1.length();i++)
			  {
				  char ch = s1.charAt(i);
				  if(ch==' ' && first_letter==false)
				  {
					  continue;
				  }
				  else
				  {
					  first_letter=true;
				  System.out.print(ch);
				  }
			  }
			 
	}

}
