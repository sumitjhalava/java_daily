public class Run2
{
    public static void main(String [] args)
    {
        Student s1 =new Student("Harsha gelchode", "B-Tech", 98.9, 2026);
        Student s2 =new Student("Nayana", "B-com", 48.9, 2025);
        Student s3 =new Student("Sawana", "B-Tech", 95.9, 2024);
        Student s4 =new Student("Vinod", "BBA", 99.9, 2026);
        Student s5 =new Student("Dinesh", "BCA", 48.9, 2016);

        Student stu[] ={s1,s2,s3,s4,s5};
        for(int i = 0 ; i<stu.length;i++)
        {
            
            // stu[i].display();
        }

        for(int i = 0 ; i<stu.length;i++)
        {
         if(stu[i].percentage >= 60.0)
         {
        
 
            // stu[i].display();
         }  
        }

        for(int i = 0 ; i<stu.length;i++)
        {
         if((stu[i].percentage >= 60.0 && (stu[i].yop == 2025 || stu[i].yop == 2026) && (stu[i].qualification.equals("B-Tech")  || stu[i].qualification.equals("BCA") )) )
         {
             stu[i].display();
         }  
        }
        
        
        
    }
}