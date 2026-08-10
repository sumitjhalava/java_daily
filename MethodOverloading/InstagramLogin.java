public class InstagramLogin
{


     static void login(String email, String pwd)
    {
        System.out.println("Login Succesfull by email and pwd");
    }
     static void login(long Phno, String pwd)
    {
        System.out.println("Login Succesfull by Phno and pwd");
        
    }

    public static void main(String[] args)
    {
        login("Ram@gmail.com", "sumit");
        login(1234567890, "sumit");
    }

   

        
    
}