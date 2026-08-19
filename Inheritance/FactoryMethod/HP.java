public class HP extends Laptop
{
    HP(String model, String color, double price)
    {
        super(model, color, price);
    }
    
    void hpDetails()
    {
        System.out.println(model + " " + color + " " + price);
    }
}