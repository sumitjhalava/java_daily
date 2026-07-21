class Program9
{
    public static void main(String[] agrs)
    {
        int n = 5;
        int val  = 0;
        for(int i= 0 ; i<n; i++)//controls no of rows
        {
            for(int j = 0; j<n ; j++)//controls no of cols
            {
                if(j%2==0)
                {   
                    val++;
                    System.out.print(  "1" + " " );
                    val--;
                }
                else
                {   
                    val--;
                    System.out.print("0" + " ");
                    val++;
                }
                

            }
            System.out.println();//next line
            
        } 
    }
}