package String_learings;

public class String_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_logic sl= new String_logic();
		sl.strip_leading();
		sl.Strip_Trailing();
		sl.Removing_unwanted_spaces();
		sl.Anagram();
		sl.Anagram_second();
		sl.String_buffer();
		sl.sub_string();
		sl.appends();
		sl.String_builder();
		
		
		
		
		
		

	}

	private void String_builder() {
		// TODO Auto-generated method stub
		 String s = "25-10-2023"; 
		    StringBuilder sb = new StringBuilder(); 
		    for(int i=0; i<s.length(); i++)
		    {
		      if(s.charAt(i)!='-')
		      {
		        sb = sb.append(s.charAt(i));
		      }
		      else
		      {
		        System.out.println(sb);
		        sb = new StringBuilder(); 
		      }
		    }
		    System.out.println(sb);
//	
//		StringBuffer vs StringBuilder: 
//
//		StringBuffer: Thread Safe [Single Thread]
//		StringBuilder: Not Thread Safe [Multithreading]
//		
	}

	private void appends() {
		// TODO Auto-generated method stub
		  String s = "25-10-2023"; 
		    StringBuffer sb = new StringBuffer(); 
		    for(int i=0; i<s.length(); i++)
		    {
		      if(s.charAt(i)!='-')
		      {
		        sb = sb.append(s.charAt(i));
		      }
		      else
		      {
		        System.out.println(sb);
		        sb = new StringBuffer(); 
		      }
		    }
		    System.out.println(sb);
		
	}

	private void sub_string() {
		// TODO Auto-generated method stub
		String s = "velmurugan";
	    String s2 = s.substring(3);
	    System.out.println(s2);

	    for(int i=3; i<s.length();i++)
	    {
	      System.out.println(s.charAt(i));
	    }
// yathuvaraikkum venumo athuvaraikkum cut pannikkalam
//	      for(int i=3; i<7;i++) 
//	      { 
//	        System.out.println(s.charAt(i));
//	      }
//	
	}

	private void String_buffer() {
		// TODO Auto-generated method stub

		//String is immutable: 
		//StringBuffer is Mutable
		    StringBuffer sb = new StringBuffer("raja");
		    System.out.println(sb);
		 
		  //  sb.replace(0, 1, "k");
		  //  System.out.println(sb);
//		    sb = sb.reverse();
//		    System.out.println(sb);

		    sb.append("rani");
		    System.out.println(sb);
		
	}

	private void Anagram_second() {
		// TODO Auto-generated method stub
		 String s1 = "sivan"; 
		    String s2 = "nivas";
		    int count = 0; 
		    if(s1.length()!= s2.length())
		      System.out.println("Not Anagram");
		    else
		    {
		      char[] first = s1.toCharArray(); 
		      // c  a  t
		      char[] second = s2.toCharArray(); 
		  for(int j=0; j<second.length;j++)
		  {
		      char letter = second[j]; //a
		      for(int i=0; i<first.length; i++)
		      {
		        if(letter == first[i])
		        {
		          first[i]='\n';
		          count++; 
		          break; 
		        }
		      }
		  
		    }
		  if(count== first.length)
		    System.out.println("Anagram");
		  else
		    System.out.println("Not Anagram");
		    }
	}

	private void Anagram() {
		// TODO Auto-generated method stub
		//womenhitler --> mother in law
		//act --> cat --> atc

		  String s1 = "cat"; 
		    String s2 = "act";
		    int count = 0; 
		    if(s1.length()!= s2.length())
		      System.out.println("Not Anagram");
		    else
		    {
		      char[] first = s1.toCharArray(); 
		      // c  a  t
		      char[] second = s2.toCharArray(); 
		  for(int j=0; j<second.length;j++)
		  {
		      char letter = second[j]; //a
		      for(int i=0; i<first.length; i++)
		      {
		        if(letter == first[i])
		        {
		          count++; 
		          break; 
		        }
		      }
		  
		    }
		  if(count== first.length)
		    System.out.println("Anagram");
		  else
		    System.out.println("Not Anagram");
		    }
	}

	private void Removing_unwanted_spaces() {
		// TODO Auto-generated method stub
		String s1 = "how     are             you";
	    //Remove Unnecessary spaces 
	    //How Are You
	    boolean first_space = true; 
	  for(int i=0; i<s1.length();i++)
	  {
	    if(s1.charAt(i)!= ' ')
	    {
	      System.out.print(s1.charAt(i)); 
	      first_space = true; 
	  //vel murugan
	    }
	    else if(first_space==true)
	      {
	      System.out.print(s1.charAt(i)); //space
	      first_space = false; 
	      }
	  }  
	    
		
	}

	private void Strip_Trailing() {
		// TODO Auto-generated method stub
		//remove a back space
		String s1 = "Tomorrow   is   Tuesday   "; 
	    System.out.println(s1);
	    for(int i=s1.length()-1; i>=0;i--)
	    {
	      char ch = s1.charAt(i);
	      if(ch!=' ')
	      {
	        int end = i; 
	        for(int j=0; j<=i; j++)
	          System.out.print(s1.charAt(j));
	        break; 
	      }
	    }
		
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
