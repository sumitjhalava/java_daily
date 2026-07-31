//
import java.util.Scanner;
class Program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the value of String : ") ;
        String str = sc.next();//will read only first word
        System.out.println("Enter the value of string : ") ;
        String str2 = sc2.nextLine();//will read the whole sentence
        System.out.println("String = : " + str );
        System.out.println("String = : " + str2 );
        
    }
}