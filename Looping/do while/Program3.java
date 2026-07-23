//perfect divisor program
class Program3
{
    public static void main(String[] agrs )
    {
        int num = 100;
        int i =1;
        while(i<= num/2)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}