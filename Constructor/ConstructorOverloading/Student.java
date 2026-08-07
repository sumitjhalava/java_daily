public class Student
{
    String name;
    String qualification;
    double percentage;
    int yop;
    String email;

    Student(String n, String q, double p, int y, String e)
    {
        name = n;
        qualification = q;
        percentage =p;
        yop=y;
        email=e;
    }

    
    Student(String n, String q, double p, int y)
    {
        name = n;
        qualification = q;
        percentage =p;
        yop=y;
        
    }

    void display()
    {
        System.out.println(name + " " + qualification + " " +  percentage + " " + yop + " " +  email);
    }


}