package Com.Xworkz.Hierarchy;

public class CivilCourt extends HighCourt{
  void propertyCase()
  {
	  System.out.println("running property case in civil court");
  }
  void theftCase()
  {
	  System.out.println("running theft case in civil court");
  }
  @Override
  void criminalCase()
  {
  	System.out.println("Invoking Criminal case in high court");
  }
  @Override
  void forgeryCase()
  {
    System.out.println("running forgery case in high court");	
  }
}
