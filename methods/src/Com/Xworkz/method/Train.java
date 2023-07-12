package Com.Xworkz.method;

public class Train {
String name;
static int compartmentNo;

static void carry()
{
	compartmentNo=7;
	compartmentNo=10;
	System.out.println("compartmentNo:"+compartmentNo);
}
void travel()
{
	System.out.println("name:"+name);
	System.out.println("compartmentNo:"+compartmentNo);
	Train.carry();
}
}
