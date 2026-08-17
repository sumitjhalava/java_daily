public class Student
{
    String name;
    String qualification;
    double percentage;
    int yop;

    Student(String name, String qualification, double percentage, int yop)
    {
        this.name=name;
        this.qualification=qualification;
        this.percentage=percentage;
        this.yop=yop;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Percentage : " + percentage);
        System.out.println("YOP : " + yop);
        
    }
}