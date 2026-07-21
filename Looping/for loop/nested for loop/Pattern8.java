class Pattern8
{
    public static void main(String[] agrs)
    {
        int n = 5;
        int val  = 1;
        for(int i= 0 ; i<n; i++)//controls no of rows
        {
            for(int j = 0; j<n ; j++)//controls no of cols
            {
                if(i%2==0)
                {
                    System.out.print(  "1" + " " );
                    
                }
                else
                {
                    System.out.print("0" + " ");
                }
                

            }
            System.out.println();//next line
            
        } 
    }
}