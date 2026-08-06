public class Student
{
    String name;
    String qualification;
    int YOP;
    double percentage;

    Student(String n, String q , int y, double p )
    {
        name =n;
        qualification=q;
        YOP=y;
        percentage=p;
    }

    void display()
    {
        System.out.println("Name : " + name + ", Qualification :  " + qualification + ", Year of passing : " + YOP + ", Percentage : " + percentage) ;
    }
}