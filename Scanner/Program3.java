//add 2 number using user input
import java.util.Scanner;
class Program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ") ;
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ") ;
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println("The sum of a is  : " + sum);
    }
}