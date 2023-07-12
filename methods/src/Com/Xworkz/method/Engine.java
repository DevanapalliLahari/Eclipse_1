package Com.Xworkz.method;

public class Engine {
String  color;
static boolean running;

 void name()
 {
	 System.out.println("The engine is running:");
	 System.out.println("color:"+color);
	 System.out.println("running:"+running);
	 Engine.display();
 }
 
 static void display()
 {
	 System.out.println("invoking the display:");
	 running=true;
	 running=false;
	 System.out.println("running:"+running);
	 
 }
}
