public class Run
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Raj", "MCA" , 32.3, 2026,"raj@gmail.com");
        Student s2 = new Student("Raj", "MCA" , 32.3, 2026);

        s1.display();
        s2.display();
        
    }
}