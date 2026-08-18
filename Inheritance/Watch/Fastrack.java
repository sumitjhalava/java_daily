public class Fastrack extends Watch
{   

    Fastrack(String m , String c, double p)
    {
        super(m,c,p);
    }
     void fastrackDetails()
    {
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        
    }
    
}


class Sonata extends Watch
{
    Sonata(String m, String c, double p)
    {
        super(m,c,p);
    }
    void sonataDetails()
    {
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }
}

class Titan extends Watch
{
    Titan(String m, String c, double p)
    {
        super(m,c,p);
    }
     void titanDetails()
    {
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }
}