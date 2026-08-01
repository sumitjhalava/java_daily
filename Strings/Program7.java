//contains(), startsWith(), endsWith()
class Program7
{
    public static void main(String [] args)
    {
        String str = "Karnataka";
        System.out.println(str.contains("nata"));
        System.out.println(str.contains("Kar"));
        System.out.println(str.contains("kar"));

        System.out.println(str.startsWith("Kar"));
        System.out.println(str.startsWith("kar"));

        System.out.println(str.endsWith("taka"));//true
        System.out.println(str.endsWith(" taka"));//false
        
        
        
        

        
               
    }
}