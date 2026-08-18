public class RunProduct
{
    public static void main(String[] args)
    {
        Mobile m1 =new Mobile("S24","Black", 45655.5);
        Mobile m2 =new Mobile("S23","White", 25655.5);
        Mobile m3 =new Mobile("Nokia","Blue", 5655.5);
        Mobile m4 =new Mobile("Panosonic","Yellow", 15655.5);
        Mobile m5 =new Mobile("RealMe","Violet", 9655.5);
        
        Laptop l1 = new Laptop("Asus","blue", 234532);
        Laptop l2 = new Laptop("HP","Yellow", 534532);
        Laptop l3 = new Laptop("Doll","pink", 23532);
        Laptop l4 = new Laptop("Mac","Violet", 294532);
        Laptop l5 = new Laptop("Lenovo","purple", 934532);
         

        Products p[] = {m1,m2,m3,m4,m5,l1,l2,l3,l4,l5};
        
        for(int i = 0 ; i < p.length; i++)
        {
             p[i].display();

        }
       
    }
}