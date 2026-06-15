import java.util.Scanner;
 class EmployeeBonusCalculator{
	
	
	public static void main( String [] args){
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String employeeName = sc.nextLine();
		
		System.out.print("Enter Salary: ");
		int salary = sc.nextInt();
		
		System.out.print("Enter Rating: ");
       
		char rating = sc.next().toUpperCase().charAt(0);
		
		
		if(salary <=  0 ){
			System.out.println(" Invalid Salary ");
			
			sc.close();
			return ;
			
			
		}
		
		   double bonusPercentage = 0;
		   
		switch(rating){
			
			case 'A' :
			bonusPercentage  = 20 ;
			break ;
			case 'B' :
			bonusPercentage  = 15;
			break ;
			case 'C' :
			bonusPercentage  = 10;
			break ;
			case 'D' :
			bonusPercentage  = 5;
			break ;
			
			default : 
			 System.out.println("Invalid Performance Rating!");
                sc.close();
                return;
        }
		
		double bonusAmount = (bonusPercentage * salary ) / 100;
		double finalSalary = ( bonusAmount + salary )  ; 

			
			System.out.println("\n===== Employee Bonus Details =====");
			System.out.println(" Employee Name : " + employeeName);
			System.out.println(" Employee Salary : " + salary);
			System.out.println(" Employee Rating : " + rating);
			System.out.println(" Employee Bonus Amount  : " +  bonusAmount);
			System.out.println(" Employee final Salary : " + finalSalary);
			
			sc.close();
			
		}
		
		
	}

