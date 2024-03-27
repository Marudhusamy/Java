class Cricket_player
{
static String country="India";//static is commmon 
int score;//non static
public static void main(String args[])
{
Cricket_player iyer= new Cricket_player();
iyer.score=55;
Cricket_player viru= new Cricket_player();
viru.score=66;
Cricket_player virat= new Cricket_player();
virat.score=177;
System.out.println(country);
iyer.bat();
viru.field();
virat.coach();
System.out.println(iyer.score);
System.out.println(viru.score);
System.out.println(virat.score);
}
void bat()
{
   System.out.println("go to bat");
}
void field()
{
System.out.println("go to field");
}
void coach()
{
System.out.println("go to beanch");
}


}


