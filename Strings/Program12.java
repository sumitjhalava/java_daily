//split()
class Program12
{
    public static void main(String [] args)
    {
        String str = " Java Full Stack";
        String [] arr = str.split(" ");
       for(int i = 1 ; i<arr.length ; i++)
       {    
         
        System.out.println(arr[i]);

       }    
    }
}