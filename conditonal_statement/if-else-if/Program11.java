class Program11
{
public static void main(String [] args)
{
int age = 5;
if(age<=3)
{
System.out.println("free ticket");
}
else if(age>3 && age<11)
{
System.out.println("Half ticket");
}
else if(age>10 && age<=60)
{
System.out.println("full ticket");
}
else
{
System.out.println("senior citizen ticket");
}
}
}