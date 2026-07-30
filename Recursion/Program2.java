class Program2
{
    static void play(int a)
    {
        System.out.println(a);
        if(a>1)
        {
            a--;
            play(a);
        }
    }
    public static void main (String[] args)
    {
        play(5);
    }
}