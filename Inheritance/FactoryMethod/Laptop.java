public class Laptop
{
    String model;
    String color;
    double price;

    Laptop(String model, String color, double price)
    {
        this.model=model;
        this.color=color;
        this.price=price;

    }
    void display()
    {
        System.out.println(model + " " + color +  " " + price);
    }
}