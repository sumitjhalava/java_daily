//print sum of all 2 digit even element present in the index mutiple of 3  even element  present at the odd index of the array
class Program18
{
    public static void main(String [] args)
    {
        int arr[] = {11,2,30,30,5,60,90,90};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            if(arr[i] % 2 == 0 && i % 3 == 0 && arr[i]>9 && arr[i]<100)
            {
                sum = sum + arr[i];
                
            }   
            
        }
        System.out.println("sum  : " + sum );
       
    }
}