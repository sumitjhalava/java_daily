class Program8
{
public static void main(String[] args)
{
double accBal = 10000.0;
int amt =3000;
if(amt<=accBal)
{
System.out.println("withdraw successful");
accBal = accBal-amt;
}
else
{
System.out.println("insufficent");
}
System.out.println("accBal");
}
}