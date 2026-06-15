class Calculator{
	
	// Addition of two integers
	public int calculate(int a,int b){
		return a + b;
		
	}
	// Addition of three integers
	public int calculate(int a,int b,int c){
		return a + b + c;
		
	}
	// Addition of two decimal no.
	public double calculate(double a,double b){
		return a + b;
		
	}
	// Mulitiplication of two integers
	
	public int multiplication( int a, int b){
		return a * b;
	}
	
}
public class CalculatorUsingMethodOverloading{
	
public static void main(String [] args){
	
	Calculator calc = new Calculator();
	
	System.out.println(" Addition of three integers : " + calc.calculate(10,20,30));
	System.out.println(" Addition of two integers : " + calc.calculate(10,20));
	System.out.println(" Addition of two decimal : " + calc.calculate(2.5,2.5));
	System.out.println(" maltiplication of two integers : "  + calc.multiplication(10,20));
}

}