//print  2 digit even element present in the even index   which is divisible by 3
class Program19
{
    public static void main(String [] args)
    {
        int arr[] = {11,2,30,30,60,60,60,90};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            if(arr[i] % 2 == 0 && i % 2 == 0 && arr[i] % 3 == 0 && arr[i]>9 && arr[i]<100)
            {
                System.out.println("index : " + i +  "  =  "+ " element " + arr[i]);
                
            }   
            
        }
       
       
    }
}