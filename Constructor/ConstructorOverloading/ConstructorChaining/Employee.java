public class Employee
{
    int empId;
    String name;
    String company;
    double salary;

    Employee(int empId,String name, String company, double salary)
    {
        this(empId,name,company);
        this.salary=salary;
        
    }

    Employee(int empId,String name, String company)
    {
        this(name,company);
        this.empId=empId;   
    }

    Employee(String name, String company,double salary)
    {
        this(name,company);
        this.empId=empId;   
    }



    Employee(String name, String company)
    {
        
        this.name=name;
        this.company=company;
        
    }

    void display2()
    {
        System.out.println(empId + " " + name + " " +  company + " " + salary);
    }
}