package String_learings;

public class String_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_basics sb =new String_basics();
		sb.letter_print();
		sb.String_methods();
		sb.indexof();
		sb.last_indexof();
		sb.uppercase();
		sb.First_char_upper();
		sb.First_Last();
		sb.LowerCase();
		sb.only_letters();
		sb.only_numbers();
		sb.startswith();
		
		
		
		
		
		
		
		
		
		
	}

	

	private void startswith() {
		// TODO Auto-generated method stub
		String name1 ="marudhu";
		String name2="mar";
		int count=0;
		for(int i=0;i<name2.length();i++)
		{
			if(name2.charAt(i)== name1.charAt(i))
				count++;
			else
			{
				System.out.println("No,letters not start with");
			    break;
			}
			
		}
		if(count==name2.length())
		{
			System.out.println("Strts with letter is "+ name2);
		}
		
	}



	private void only_numbers() {
		// TODO Auto-generated method stub
		String name ="marudhusamy99@gmail.com";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch>='0' && ch<='9')
			System.out.print(ch);
		}
		
		
	}



	private void only_letters() {
		// TODO Auto-generated method stub
		String name ="marudhusamy99@gmail.com";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch>='a' && ch<='z')
			System.out.print(ch);
			
			//only special charectors logic
//			if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
//			{
//				
//			}
//			else
//				{
//				System.out.print(ch);
//				}
		}
		
		
	}



	private void LowerCase() {
		// TODO Auto-generated method stub
		String name ="MARUDHU";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			ch=(char)(ch+32);
			System.out.println(ch);
		}
		
	}



	private void First_Last() {
		// TODO Auto-generated method stub
String name ="united";
		
		for(int i=0;i<name.length();i++)
		{
		   
			char ch = name.charAt(i);
			if(i==0 || i==name.length()-1 || i==name.length()/2)
			//if(i%2==0)
				
			{
			ch=(char)(ch-32);
			}
			System.out.print(ch);
		}
		
		
	}



	private void First_char_upper() {
		// TODO Auto-generated method stub
String name ="united";
		
		for(int i=0;i<name.length();i++)
		{
		   
			char ch = name.charAt(i);
			if(i==0)
			{
			ch=(char)(ch-32);
			}
			System.out.print(ch);
		}
		
	}



	private void uppercase() {
		// TODO Auto-generated method stub
		String name ="united";
		
		for(int i=0;i<name.length();i++)
		{
		   
			char ch = name.charAt(i);
			ch=(char)(ch-32);
			System.out.print(ch);
		}
		
	}

	private void last_indexof() {
		// TODO Auto-generated method stub
		String name="unitedstatusofamerica";
		int key='e';
		for(int i=name.length()-1;i>=0;i--)
		{
			if(key==name.charAt(i))
			{
				System.out.print(i+" ");
				break;
			}
		
		}
			
		
	}

	private void indexof() {
		// TODO Auto-generated method stub
		//index of logic
		String name="unitedstatusofamerica";
		int key='e';
		for(int i=0;i<name.length();i++)
		{
			if(key==name.charAt(i))
			{
			System.out.print(i);
			break;
			}
		}
	}

	private void String_methods() {
		// TODO Auto-generated method stub
		String name="unitedstatusofamerica";
		name =name.toUpperCase();
		System.out.println(name);
		name=name.toLowerCase();
		System.out.println(name);
		System.out.println(name.contains("status"));
		System.out.println(name.indexOf('t'));
	    System.out.println(name.lastIndexOf('t'));
	    System.out.println(name.startsWith("united"));
	    System.out.println(name.endsWith("rica"));
		
	}

	private void letter_print() {
		// TODO Auto-generated method stub
		String name ="karur";
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
		  char ch=name.charAt(i);
		  System.out.println(ch);
		}

		
	}

}
