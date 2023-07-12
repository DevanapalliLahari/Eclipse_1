package Com.Xworkz.method;

public class Printer {
static String brand;
int price;

static void computer()
{
	brand="laser";
	brand="solidink";
	System.out.println("brand:"+brand);
}
void ink()
{
	System.out.println("price:"+price);
	System.out.println("brand:"+brand);
	Printer.computer();
}
}
