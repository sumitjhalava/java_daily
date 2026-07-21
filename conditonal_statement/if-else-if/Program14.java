class Program14
{
    public static void main(String [] args)
    {
        double accBal = 10000.0;
        int amt = 1000;
        if(amt <= accBal)
        {
            if(amt % 100 == 0)
            {
                System.out.println(amt + " " + "Withdrawal Successful");
            }
            else
            {
                System.out.println("invalid amount. enter amount > 100");
            }
        }
        else
        {
            System.out.println("Insaficent Balance");
        }
    }

}