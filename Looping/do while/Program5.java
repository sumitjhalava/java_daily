class Program5
{
    public static void main(String[] args)
    {
        int num = 28;
        int i =1;
        int sum =0;
        while(i<= num/2)
        {
            if(num%i==0)
            {
                // System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum = " + sum);
        if(sum==num)
        {
            System.out.println(num + " Is a perfect number");
        }
        else
        {
        System.out.println(num + " Is not a perfect number");
        }
    }
}