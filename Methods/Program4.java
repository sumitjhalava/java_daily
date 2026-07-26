\\actual argument and formal argument 
class Program4
{
    static void help(char ch)
    {
        System.out.println("value : "  + ch);
    }
    static void play(double agr)
    {
        System.out.println("value : " + agr);
        help('J');
    }
    public static void main (String [] args)
    {
        play(7.6);
    }
}