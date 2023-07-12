package Com.Xworkz.method;

public class NailCutter {
String brand;
static int cost;

static void nail()
{
	cost=100;
	cost=200;
	System.out.println("cost:"+cost);
}
void cutter()
{
	System.out.println("brand:"+brand);
	System.out.println("cost:"+cost);
	NailCutter.nail();
}
}
