class Program2
{
    public static void main(String [] args)
    {
        String watch[] = {"Sonota","Titan", "Fasttrack", "G-shock"};
        for(int i = 0; i <= watch.length-1;i++)
        {
            System.out.println("Watch :" + watch[i]);
        }
        System.out.println(" ");
        for(int i = watch.length-1; i>=0 ; i--)
        {
            System.out.println("Watch :" + watch[i]);
        }
    }
}