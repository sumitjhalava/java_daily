//sum of all the perfect divisor
class Program6
{
    public static void main(String[]args)
    {
        int num = 28;
        int i =1;
        int count = 0;
        while(i<= num/2)
        {
            if(num%i==0)
            {
                count++;
            }
            i++;
            
            
        }
        System.out.println("Count  = " + count);
        

    }
}