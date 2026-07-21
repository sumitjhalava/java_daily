class Program15
    {
        public static void main(String [] args)
        {
            char gender = 'm';
            int age = 66;
            if(gender == 'm')
            {
                if(age >=21)
                {
                    System.out.println("Eligible Bachelore");
                }
                else
                {
                    System.out.println("Underage boy");
                }
            }
            else if(gender == 'f')
            {
                if(age>=18)
                {
                    System.out.println("Eligible Spinster");
                }
                else
                {
                    System.out.println("Under age girl");
                }
            }
        }

    }