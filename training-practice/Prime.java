import java.util.Scanner;
class Prime{

 public static void main(String [] args){
 
 Scanner sc = new Scanner(System.in);
 
 System.out.println(" Please enter the no. for to check it's prime or not ");
 
 int number = sc.nextInt();
  if( number <= 1){
  System.out.println(" Not prime no .");
  }
  else if(number == 2 ){
   System.out.println( number + " is even prime no. ");
  }
  else{
   for( int a = 2;a < number;a++){
          if( number % a ==0){
		   System.out.println(" this is not prime no. " );
		  
		   return; 
		  }
		  else{
		  System.out.println(" this is a prime no.");
		  break;
		  }	  
   }
  }
 }
}