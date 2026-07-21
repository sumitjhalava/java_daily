class Pattern6
{
    public static void main(String[] agrs)
    {
        int n = 5;
        int val  = 1;
        for(int i= 0 ; i<n; i++)//controls no of rows
        {
            for(int j = 0; j<n ; j++)//controls no of cols
            {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();//next line
             val=1;
        } 
    }
}