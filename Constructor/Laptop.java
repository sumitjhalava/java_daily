public class Laptop
{
    String model;
    String color;
    double price;
    int ram;
    int ssd;
    String proccesor;

    Laptop(String m, String c , double p , int r, int sd, String pro)
    {
        model = m;
        color = c;
        price = p;
        ram = r;
        ssd = sd;
        proccesor = pro;
    }

    void display1()
    {
        System.out.println("Model : " + model + ", Color : " + color + ", Price : " + price + ", SSD : " + ssd + ", Processor : " + proccesor);
    }
}