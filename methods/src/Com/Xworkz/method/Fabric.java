package Com.Xworkz.method;

public class Fabric {
 static String name;
 int cost;
  static void use()
  {
	  System.out.println("The fabric is invoking");
	  name="cotton";
	  name="silk";
	  System.out.println("name:"+name);
  }
  void type()
  {
	  System.out.println("The type of fabric is:");
	  System.out.println("cost:"+this.cost);
	  Fabric.use();
  }
}
