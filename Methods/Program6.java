//multiple arguments
class Program6
{
    static void play(double a, double b, double c , double d)
    {
        double sum = a + b + c + d;
        System.out.println("sum of a,b is  : " + sum);
    }
    public static void main (String [] args)
    {
        play(0.6,13.34,1234.342,1.234);
    }
}