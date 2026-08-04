public class Student
{
    String name ;
    int physics ; 
    int chemistry ;
    int maths ;
    int optional;

    
    

    void display()
    {
        System.out.println("Physics : "  + physics);
        System.out.println("Chemistry : "  + chemistry);
        System.out.println("Maths: "  + maths);
        System.out.println("Optional : "  + optional);    
    }

    void totalMarks()
    {
        int totalMarks = physics + chemistry + maths + optional ;
        System.out.println("Total Marks : " + totalMarks);

    } 

    void percentage()
    {  
        int totalMarks = physics + chemistry + maths + optional ;
        double percentage = totalMarks / 4.0 ;
        System.out.println("Percentage : " + percentage);
    }
    
}