class Pattern5
{
    public static void main(String[] agrs)
    {
        int n = 5;
        char val  = 'a';
        for(int i= 0 ; i<n; i++)//controls no of rows
        {
            for(int j = 0; j<n ; j++)//controls no of cols
            {
                System.out.print(val + " ");
                val++;//'val' value incresed by 1
            }
            System.out.println();//next line
            val='a';//'val' re-initialized with a
        } 
    }
}