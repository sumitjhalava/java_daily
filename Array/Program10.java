//print last half element of array 
class Program10
{
    public static void main(String [] args)
    {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i = (arr.length/2); i <= arr.length-1  ; i++ )
        {
            System.out.println(arr[i]);
        }
    }
}