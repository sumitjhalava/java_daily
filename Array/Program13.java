//transfering data from one array to another
class Program13
{
    public static void main(String [] args)
    {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int arr2[] = new int[10];
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            
                arr2[i] = arr[i]; 
                System.out.println(arr[i]);
        }
        
       
    }
}