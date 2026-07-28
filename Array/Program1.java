class Program1
{
    public static void main (String [] args)
    {
        //Array  declaration and creation
        String str[];
        str = new String[4];
        //Array Intialization
        str[0] = "Duke";
        str[1] = "Splender";
        str[3] = "apache 400";

        System.out.println("Length of array : " + str.length);
        int index = str.length-1;
        System.out.println("last index : " + index);
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);
        
    }
}