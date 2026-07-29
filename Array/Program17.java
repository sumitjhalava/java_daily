//print all the  odd element  present at the even index of the array
class Program17
{
    public static void main(String [] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            if(arr[i] % 2 == 1 && i % 2 == 0)
            {
                System.out.println(arr[i]);
            }   
        }
       
    }
}