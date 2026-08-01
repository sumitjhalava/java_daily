//indexOf()
class Program5
{
    public static void main(String [] args)
    {
        String str = "Karnataka";
        System.out.println("first occurance of r is :" + str.indexOf('r'));
        System.out.println("first occurance of K is : " + str.indexOf('K'));
        System.out.println( "first occurance of t is : " +  str.indexOf('t'));
        int p = str.indexOf('a');
        int q = str.indexOf('a' , p+1);
        int r = str.indexOf('a', q+1);
        System.out.println("first occurance  of a :  " + p  );//first occurance
        System.out.println("second occurance  of a :  " + q  );//second ocurance of a
        System.out.println("third occurance  of a :  " + r );
        
        
              
    }
}