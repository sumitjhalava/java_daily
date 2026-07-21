class Counting6
{
public static void main(String[] args)
{
int product = 0; 
for(int i = 1; i<=10;i++)
{ 
if(i % 2 ==1)
{
product = product * i;

}
}
System.out.println(product);
}
}