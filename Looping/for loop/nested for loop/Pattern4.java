class Pattern4
{
    public static void main(String[] agrs)
    {
        int n = 5;
        int val  = 5;
        for(int i= 0 ; i<n; i++)//controls no of rows
        {
            for(int j = 0; j<n ; j++)//controls no of cols
            {
                System.out.print(val + " ");
            }
            System.out.println();//next line
            val--; //'val' value increase by 1
        } 
    }
}