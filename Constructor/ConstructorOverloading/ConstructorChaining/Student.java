public class Student
{
    String name;
    String qualification;
    double percentage;
    int yop;
    String email;

    Student(String name, String qualification, double percentage, int yop, String email)
    {
        this(name,qualification,percentage,yop);
        this.email=email;
    }

    
    Student(String name, String qualification, double percentage, int yop)
    {
        this.name = name;
        this.qualification = qualification;
        this.percentage =percentage;
        this.yop=yop;
        
    }

    void display()
    {
        System.out.println(name + " " + qualification + " " +  percentage + " " + yop + " " +  email);
    }


}