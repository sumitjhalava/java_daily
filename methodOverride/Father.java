public class Father
{
    int money =40000;
    String car ="bmw";
    String girlfriend = "monika";
    void longDrive()
    {
        System.out.println("Long with " + girlfriend + "On" + car);
    }
}

class Son extends Father
{
    String car = "Audi";
    String girlfriend = "premika";

    @override
    void longDrive()
    {
        System.out.println("Long Drive with : " + super.girlfriend + "&" + girlfriend + "on" + car);
    }
}