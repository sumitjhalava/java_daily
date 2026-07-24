//There can be multiple metohds in a java program
class Program2
{
    static void help()
    {
        System.out.println("Executing help()...");
    }
    static void disp()
    {
        System.out.println("Executioning disp()");
    }
    static void push()
    {
        System.out.println("Execution push()...");
    }

    public static void main (String [] args) 
    {
        help();
        push();
        disp();
    }


}