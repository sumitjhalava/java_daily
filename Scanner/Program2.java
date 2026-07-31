//Taking input and checking weather input is even or odd
import java.util.Scanner;
class Program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ") ;
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number you entered is even");
        }
        else
        {
            System.out.println("The number you entered is odd number ");
        }
        System.out.println("The value of a is  : " + a);
    }
}