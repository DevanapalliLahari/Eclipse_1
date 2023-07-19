package Com.Xworkz.Hierarchy;

public class HighCourt extends SupremeCourt {
void criminalCase()
{
	System.out.println("Invoking Criminal case in high court");
}
void forgeryCase()
{
  System.out.println("running forgery case in high court");	
}
@Override
void importanceCase()
{
	 System.out.println("invoking no argument cons of importance case");
}
}
