public class RunWatch
{
    public static void main(String [] args)
    {
        Fastrack f1 = new Fastrack("Sports", "white" , 4456);
        Fastrack f2 = new Fastrack("Casual", "black" , 5456);
          
        Sonata s1 = new Sonata("Popular", "pink", 32325);
        Sonata s2 = new Sonata("Revese", "violet", 986525);

        Titan t1 = new Titan("Casual", "blue", 3235);
        Titan t2 = new Titan("Formal", "Yellow", 23435);


        Watch w[] = {f1,f2,s1,s2,t1,t2};

        for(int i = 0 ; i<=w.length-1; i++)
        {
            w[i].display();
        }

        for(int i = 0; i<=w.length-1;i++)
        {
            if(w[i]!=null)
            {
                if(w[i] instanceof Fastrack)
                {
                    Fastrack f =(Fastrack)w[i];
                    f.fastrackDetails();
                }
                else if(w[i] instanceof Sonata)
                {
                    Sonata s = (Sonata)w[i];
                    s.sonataDetails();
                }
                else
                {
                    Titan t = (Titan)w[i];
                    t.titanDetails();
                }
            }
        }
        

        
        

    }
}