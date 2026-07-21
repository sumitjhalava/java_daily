class Program3
{
    public static void main(String[]args)
    {
        int choice = 4;
        switch(choice)
        {
            case 1 : System.out.println("Withdrawal");
            break;
            case 2 : System.out.println("Balance Enquiry");
            break;
            case 3 : System.out.println("Pin Change");
            break;
            case 4 : System.out.println("Mini Statement");
            break;
            default: System.out.println("Invalid choice");
        }
    }
}