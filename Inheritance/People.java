public class People
{
    String country;
    String state;
    String city;

    People(String country, String state, String city)
    {
        this.country=country;
        this.state=state;
        this.city=city;

       
    }
     void display()
        {
            System.out.println("COuntry : " + country + "State :  " + state + "City : " + city);
        }
}