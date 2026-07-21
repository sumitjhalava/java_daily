class Program5
{
    public static void main(String[]args)
    {
        char choice = 'c';
        switch(choice)
        {
            case 'A' : System.out.println("APPLE");
            break;
            case 'B' : System.out.println("BALL");
                        System.out.println("BAT");
            break;
            case 'C' : System.out.println("CAT");
            break;
            default: System.out.println("UNDER-DEVLOPEMENT");   
        }
    }
}