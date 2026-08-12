class Run 
{
    public static void main(String[] agrs)
    {
        Car c1 = new Car();
        c1.model = "BMW";
        c1.color="red";
        c1.price=334543.4;

        Bike b1 = new Bike();
        b1.model="duke";
        b1.color="pink";
        b1.price=234.4;

        // c1.display();
        // b1.display();

        Employee e1 = new Employee("India","MP","Indore",101,"TCS","Devloper");
        e1.display();
    }
}