class Program15
{
    static double calculateFare(double km, char mode)
    {
        double fare = 0.0;
        switch(mode)
        {
            case 'A' : fare = km * 12;
            break;
            case 'B' : fare =  km  * 10;
            break;
            case 'C' : fare = km * 15; 
            break;
        }
        return fare;  
    }
    public static void main(String[] args)
    {
        System.out.println("fare : " + calculateFare(12,'C'));
    }
}