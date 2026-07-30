//factorial using recursion
class Program3
{
    static void factorial(int fact,  int n)
    {
        fact = fact * n ;
        if(n>1)
        {
            n--;
            factorial(fact,n);
        }
        else
        {
            System.out.println("factorial = " +   fact);
        }
    }
    public static void main (String[] args)
    {
        factorial(1,7);
    }
}