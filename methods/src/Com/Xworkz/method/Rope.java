package Com.Xworkz.method;

public class Rope {
  static String type;
  int cost;
  
  static void name()
  {
	type="nylon";
	type="rubber";
	  System.out.println("type:"+type);
  }
  void cradile()
  {
	  System.out.println("cost:"+cost);
	  System.out.println("type:"+type);
	  Rope.name();
  }
}
