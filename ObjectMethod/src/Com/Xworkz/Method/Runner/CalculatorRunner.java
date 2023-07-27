package Com.Xworkz.Method.Runner;

import Com.Xworkz.Metod.App.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("running main");
   
        Calculator calculator = new Calculator();
        calculator.getName();
        calculator.getPrice();
        calculator.getNoOfKeys();
        calculator.getVersion();
        calculator.getType();
		System.out.println(calculator.toString());
		Calculator calculator1 = new Calculator();
		calculator1.setName ("casio");
		calculator1.setPrice (900);
		calculator1.setNoOfKeys (25);
		calculator1.setVersion();
		calculator1.setType ("Syntific");
		System.out.println(calculator1.toString());
	}

}
