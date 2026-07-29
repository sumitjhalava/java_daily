//count the 2 digit number present in the array 
class Program21
{
    public static void main(String [] args)
    {
        int arr[] = {11,2,30,30,60,60,60,90};
        int count= 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {

                if( arr[i]>9 && arr[i]<100)
            {
                count++;
            }   
            
        }
        System.out.println(count);
       
       
    }
}