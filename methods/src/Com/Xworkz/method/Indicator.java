package Com.Xworkz.method;

public class Indicator {
static String type;
int noOfValues;

static void display()
{
	type="absortion";
	type="natural";
	System.out.println("type:"+type);
}
void value()
{
	System.out.println("type:"+type);
	System.out.println("noOfValues:"+noOfValues);
	Indicator.display();
}
}
