class Program17
{
    static int sq(int n)
    {
        int square = n*n;
        return square;
    }
    public static void main(String [] args)
    {
        for(int a = 1; a<=15; a++)
        {
        System.out.println(a + " " + "Square " + sq(a));
        }
        
    }
}