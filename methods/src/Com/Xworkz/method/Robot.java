package Com.Xworkz.method;

public class Robot {
static String use;
int capacity;

static void version()
{
	use="hotal";
	use="hospital";
	System.out.println("use:"+use);
}
void display()
{
	System.out.println("use:"+use);
	System.out.println("capacity:"+capacity);
	Robot.version();
}
}
