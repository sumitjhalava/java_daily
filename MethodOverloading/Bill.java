public class Bill
{
    void payment()
    {
        System.out.println("Payment Done");
    }
    void payment(String upiID, int pin)
    {
        System.out.println("Payment Done using UPI");
    }
    void payment(String cusID, String pwd)
    {
        System.out.println("Payment done using Netbanking");
    }
    
    void payment(int cardD, int otp)
    {
        System.out.println("Payment done using Card");
    }

    

}