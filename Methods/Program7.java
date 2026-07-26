class Program7
{
    static void display(long number, char gender, boolean single)
    {
        System.out.println("Number : " + number);
        System.out.println("Gender : " + gender);
        System.out.println("single : " + single);
        
    }
    public static void main (String [] args)
    {
        display(1234567890L,'M',true);
        display(1234569999L,'F',false);
        display(55554567890L,'F',false);
        
        
    }
}