package Com.Xworkz.Hierarchy;

public class FamilyCourt extends CivilCourt{
void divorce()
{
	System.out.println("divorce process is running");
}
@Override
void criminalCase()
{
	System.out.println("Invoking Criminal case in high court");
}
void forgeryCase()
{
  System.out.println("running forgery case in high court");	
}
}
