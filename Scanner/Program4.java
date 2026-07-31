//taking long, boolean , int value from the user 
import java.util.Scanner;
class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number: ") ;
        long mobile = sc.nextLong();
        System.out.println("Are you single (true/false)") ;
        boolean b = sc.nextBoolean();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Mobile number = : " + mobile );
        System.out.println("Single= : " + b );
        System.out.println("age = : " + age );
        
        
    }
}