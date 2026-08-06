public class Run
{
    public static void main (String [] args)
    {
        Student s1 = new Student("Sumit", "B-tech", 2026, 81.2);
        Student s2 = new Student("Harsh gay", "B-tech", 2026, 85);

        s1.display();
        s2.display();

        Laptop l1 = new Laptop("HP","Black",42456.3,12,556,"Intel");
        Laptop l2 = new Laptop("Asus","Grey",52456.3,8,652,"Ryzen");
        
        l1.display1();
        l2.display1();
        
    }
}