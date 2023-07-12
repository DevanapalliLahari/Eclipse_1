package Com.Xworkz.method;

public class Cylinder {
 String name;
 static int height;
 
 static void cylinder()
 {
	 System.out.println("invoking the cylinder");
	  height=19;
	  height=20;
	  System.out.println("height:"+height);
 }
 void gas()
 {
	 System.out.println("invoking the gas");
	 System.out.println("name:"+this.name);
	 System.out.println("height:"+height);
	 Cylinder.cylinder();
 }
}
