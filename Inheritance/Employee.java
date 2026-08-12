public class Employee extends People
{
    int empId ;
    String company;
    String desigination;

    Employee(String coun, String stat, String cit, int emp, String comp, String desi)
    {
        super(coun,stat,cit);
        empId=emp;
        company=comp;
        desigination=desi;

        
    }
    void display()
        {
            super.display();
            System.out.println("EmpID : " + empId + "Company : " + company + "Desigination : " + desigination);
        }
}