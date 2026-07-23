//prime number
class Program7
{
    public static void main(String[]args)
    {
        int num = 12;
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
        if(count==1)
        {
        System.out.println(num + " Is a prime number");
        }
        else
        {
            System.out.println(num + " Is not not a prime number");
        
        }

    }
}