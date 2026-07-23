//sum of all the perfect divisor
class Program4
{
    public static void main(String[]args)
    {
        int num = 12;
        int i =1;
        int sum =0;
        while(i<= num/2)
        {
            if(num%i==0)
            {
                System.out.println(i);
                sum = sum + i;
            }
            i++;
            
        }
        System.out.println("Sum  = " + sum);
    }
}