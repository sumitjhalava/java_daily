//print sum of all the element of the array
class Program11
{
    public static void main(String [] args)
    {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            sum = sum + arr[i];
            
        }
        System.out.println("Sum : " + sum);
    }
}