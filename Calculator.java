package learn;

public class Calculator
{
public static void main(String[] args)
{



Calculator calc=new Calculator();
int output=calc.add(10,20);
System.out.println(output);
calc.add(10,11,29);
float res=calc.add(10,6.5f);
System.out.println(res);


}
 public int add(int no1,int no2)
{
//System.out.println(no1 + no2);
int result=no1+no2;
return result;
}

void add(int no1,int no2,int no3)
{
System.out.println(no1+no2+no3);
}

private float add(int no1,float no2)
{
//System.out.println(no1 + no2);
float result=no1+no2;
return result;
}

}
