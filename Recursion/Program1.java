class Program1
{
    static void play(int a)
    {
        System.out.println(a);
        if(a<5)
        {
            a++;
            play(a);
        }
    }
    public static void main (String[] args)
    {
        play(1);
    }
}