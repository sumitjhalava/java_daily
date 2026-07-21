class Discount
{
public static void main(String[]args)
{
int shirt1 = 6600;
int shirt2 = 4600;
int shirt3 = 4600;
int shirt4 = 2600;
int shirt5 = 1600;

int pant1 = 1334;
int pant2 = 2334;
int pant3 = 3334;
int pant4 = 4334;
int shirttotal = shirt1+shirt2+shirt3+shirt4;
int panttotal = pant1+pant2+pant3+pant4;
int shirtoffer = (shirttotal*15)/100;
int pantoffer = (panttotal*25)/100;

System.out.println("The total amount of pants is rs : " + panttotal );
System.out.println("The total amount of pants after offer is rs: " + pantoffer);

System.out.println("The total amount of shirt is rs : " + shirttotal);
System.out.println("The total amount of shirts after offer are : " + shirtoffer);


}
}