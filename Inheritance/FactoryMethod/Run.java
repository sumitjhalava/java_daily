public class Run
{
    public static void main(String [] args)
    {
        Laptop l1 = LaptopFactory.getLaptop("HP");
        System.out.println(l1);
        if(l1 != null)
        {
            if(l1 instanceof HP)
            {
                HP h = (HP)l1;
                h.hpDetails();
            }
            else if( l1 instanceof Lenovo)
            {
                Lenovo l = (Lenovo)l1;
                l.lenovoDetails();
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }
}