public class Lenovo extends Laptop
{
    Lenovo(String model, String color, double price)
    {
        super(model, color, price);
    }

    void lenovoDetails()
    {
        System.out.println(model + " " + color + " " + price);
    }
}

