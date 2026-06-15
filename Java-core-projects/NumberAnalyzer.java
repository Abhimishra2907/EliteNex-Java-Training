
import java.util.Scanner;
class NumberAnalyzer{
	
	
	public void checkNumber(int number){
		if(number % 2 == 0){
			System.out.println(" This is even no. : " + number);
			
		}else{
			System.out.println(" This is an odd number. : " + number);
		}
		
		
	}




public static void main( String [] args){

Scanner sc  = new Scanner(System.in);
 System.out.println(" plz enter the no. : ");
 
 int num = sc.nextInt();
  System.out.println(" plz enter the no.");
  
  if( num > 0){
  System.out.println(" This is positive no. : " + num);
  }
  else if(num<0){
  System.out.println(" This is negative no. : " + num );
  }
else{
  System.out.println(" This is zero no. : " + num );
}

NumberAnalyzer number = new NumberAnalyzer();
  number.checkNumber(num) ;
  
  sc.close();
       

}
}