//a method can be called multiple times in a java program
class Program1
{
    public static void main(String [] args)
    {
        System.out.println("Execution starts");
        play();
        play();
        play();
        play();
        play();
        
        System.out.println("Execution ends");
    }

    static void play()
    
    {
        System.out.println("Execution play()...");
    }
}