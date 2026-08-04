public class Runner2
{
    public static void  main (String [] args ) 
    {
         Student s1= new Student();
    s1.name = "sawan";
    s1.physics = 78;
    s1.maths = 67;
    s1.chemistry = 98;
    s1.optional = 87;

    s1.display();
    s1.percentage();
    s1.totalMarks();
    }
   
}