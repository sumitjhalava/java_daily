//In java any metohd can call any method
class Program3
{
    static void help()
    {
        System.out.println("Executing help()...");
    }
    static void disp()
    {
        System.out.println("Executioning disp()");
        help();
    }
    static void push()
    {
        System.out.println("Execution push()...");
        disp();
    }

    public static void main (String [] args) 
    {
        push();
        
    }


}