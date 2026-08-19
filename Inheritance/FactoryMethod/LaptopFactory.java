public class LaptopFactory
{
    static Laptop getLaptop(String input)
    {
        if(input.equalsIgnoreCase("Lenovo"))
        {
            return new Lenovo("LEV1", "Black", 2000);
        }
        else if(input.equalsIgnoreCase("HP"))
        {
            return new HP("HP21","Blue",2342);
        }
        else
        {
            return null;
        }
    }
}