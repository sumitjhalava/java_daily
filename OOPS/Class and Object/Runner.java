public class Runner
{
    public static void main(String [] args)
    {
        Watch w1 = new Watch();
        Watch w2 = new Watch();
        
        w1.brand = "titan";
        w1.price = 2000;
        w2.brand = "titan";
        w2.price = 200;
        
        System.out.println("Brand : " + w1.brand);
        System.out.println("Price : " + w1.price);
        System.out.println("Price : " + w2.brand);
        System.out.println("Price : " + w2.price);
        
        
    }
}