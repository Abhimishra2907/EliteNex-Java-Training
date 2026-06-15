import java.util.Scanner;
class  AreaCalculator{
	
	
	public int  calculateArea(int side){
		return side * side;
		
	}
	
	public int  calculateArea(int length, int width){
		return length * width ;
		
	}
	public double  calculateArea(double radius){
		return 3.14 * radius * radius;
		
	}
	
	public double  calculateArea(double base , double height){
		return(0.5 * base * height);
	}
	
}
public class AreaCalculatorUsingMethodOverloading{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		AreaCalculator area = new AreaCalculator();
		
		// square
		System.out.println("Enter the side of square : ");
		int side = sc.nextInt();
		
		// rectangle
		System.out.println(" Enter the length of rectangle  : ");
		int length = sc.nextInt();
		
		System.out.println(" Enter the  width of rectangle : ");
		int width = sc.nextInt();
		
		//circle
		System.out.println(" Enter the radius of circle  : ");
		double radius = sc.nextDouble();
		
		//triangle
		System.out.println(" Enter the base of trangle  : ");
		double base = sc.nextDouble();
		
		System.out.println(" Enter the height of trangle  : ");
		double height = sc.nextDouble();
		
		// display
		System.out.println(" \n  ----------Areas-------");
		
		System.out.println(" Area of Square    : " + 
		                                       area.calculateArea(side));
		System.out.println(" Area of Rectangle : " +   
		                                       area.calculateArea(length,width));
		System.out.println(" Area of Circle    : " +
                                       		   area.calculateArea(radius));
		System.out.println(" Area of Trangle   : " +  
		                                       area.calculateArea(base,height));
		
	    sc.close();
	}
}