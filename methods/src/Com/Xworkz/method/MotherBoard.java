package Com.Xworkz.method;

public class MotherBoard {
static String brand;
int warenty;

static void version()
{
	brand="biostar";
	brand="intel";
	System.out.println("brand:"+brand);
	
}
void type()
{
	System.out.println("brand:"+brand);
	System.out.println("warenty:"+warenty);
	MotherBoard.version();
}
}
