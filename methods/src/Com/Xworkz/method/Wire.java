package Com.Xworkz.method;

public class Wire {
static String color;
int weight;

static void display()
{
	color="green";
	color="black";
	System.out.println("color:"+color);
}
void power()
{
	System.out.println("color:"+color);
	System.out.println("weight:"+weight);
	Wire.display();
}
}
