//print all the element of array except first and last
class Program6
{
    public static void main(String [] args)
    {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 1 ; i<= arr.length-2 ; i++ )
        {
            System.out.println(arr[i]);
        }
    }
}