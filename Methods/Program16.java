class Program16
{
    static double calculateBill(double unit)
    {
        double bill = 0.0;
        if(unit>100)
        {
          bill = unit*5;

        }
        bill = bill + (bill*0.18);
        return bill;
        
    }
    public static void main(String[] args)
    {
        System.out.println("Electricity bill : " + calculateBill(12));
        System.out.println("Electricity bill : " + calculateBill(112));
        
    }
} 