//print all the number multiple of 5 or 3 present in the index which is divisible by 3
class Program20
{
    public static void main(String [] args)
    {
        int arr[] = {11,2,30,30,60,60,60,90};
        int sum = 0;
        for(int i = 0 ; i<= arr.length-1  ; i++ )
        {
            if(arr[i] % 5 == 0 || i % 3 == 0  )
            {
                if(i % 3 == 0 && i>0)
                {
                System.out.println("index : " + i +  "  =  "+ " element " + arr[i]);
                }
                
            }   
            
        }
       
       
    }
}