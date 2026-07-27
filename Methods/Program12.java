//passing and returing at the same time
class Program12
{
    static boolean play(int a)
    {
        if(a % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main (String [] args)
    {
        System.out.println("status :  " +play(10));
        System.out.println("status :  " +play(15));
        
    }
}