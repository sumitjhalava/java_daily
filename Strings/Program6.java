//lastIndexOf()
class Program6
{
    public static void main(String [] args)
    {
        String str = "Developer";
        System.out.println("last occurance of r is :" + str.lastIndexOf('l'));
        System.out.println("last occurance of K is : " + str.lastIndexOf('o'));
        System.out.println( "last occurance of t is : " +  str.lastIndexOf('m'));
        int p = str.lastIndexOf('e');
        int q = str.lastIndexOf('e' , p-1);
        int r = str.lastIndexOf('e', q-1);
        System.out.println("last occurance  of e :  " + p  );//last occurance index of e
        System.out.println("second last occurance  of e :  " + q  );//second last ocurance of e
        System.out.println("third last occurance  of e :  " + r );
        
        
              
    }
}