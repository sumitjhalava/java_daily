class Program4
{
    public static void main(String[]args)
    {
        int button = 3;
        switch(button)
        {
            case 1 : System.out.println("Excellent");
            break;
            case 2 : System.out.println("Good");
            break;
            case 3 : System.out.println("Average");
            break;
            case 4 : System.out.println("Poor");
            break;
            default: System.out.println("Skip feedback");
        }
    }
}