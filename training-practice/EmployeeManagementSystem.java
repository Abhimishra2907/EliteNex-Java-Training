import java.util.*;
import java.time.LocalDate;

class Employees {

    int id;
    String name;
    String department;
    double salary;
    LocalDate joiningDate;

    Employees(int id, String name, String department,
              double salary, LocalDate joiningDate) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public void display() {
		
		System.out.println("----------------------------------");
        System.out.println("Employee Details");
        System.out.println("----------------------------------");
	
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("department : " + department);
        System.out.println("salary : " + salary);
        System.out.println("joiningDate : " + joiningDate);
		
    }
}   

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employees> employees = new ArrayList<>();
  while(true){
		
		System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM ====="); 
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Remove Employee");
		System.out.println("4. Update Salary");
		System.out.println("5. Search Employee by ID");
		System.out.println("6. Find Highest Paid Employee");
		System.out.println("7. Group Employees by Department");
		System.out.println("8. Sort by Salary");
		System.out.println("9. Sort by Joining Date");
		System.out.println("10. Count Employees Department-wise");
		System.out.println("11. Exit");
		
		try{
		System.out.println(" Enter Choise: ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		    switch(choice){
			    case 1 : {
				System.out.println(" Enter Id : ");
                int id =  sc.nextInt();
                  sc.nextLine();

                System.out.println(" Enter Name : ");	
                String name = sc.nextLine();
				
				System.out.println(" Enter Department : ");
				String department = sc.nextLine();
				
				System.out.println(" Enter Salary : ");
				double salary = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Enter Joining Date (yyyy-mm-dd): ");
                LocalDate joiningDate = LocalDate.parse(sc.next());
				
				employees.add(new Employees(id,name,department,salary,joiningDate));
				
				System.out.println(" Add Employee Detail Successfully");
				
			    break;
			  			  }
			   case 2:{
				   int count = 1;
				  System.out.println(" No  Employee Data Employees");
                  
				  for( Employees emp : employees ){
					    System.out.println("\nEmployee #  " + count++  + emp.name);
					  emp.display();
				  }
				  break;
				  
			   }
			   
			   case 3:{
				   System.out.println(" Enter Employee Id");
				   
				   int removeId = sc.nextInt();
				   employees.removeIf( emp -> emp.id == removeId);
				   
				   System.out.println(" Employee Remove Successfully.");
				   
				   
				   break;
			   }
			  case 4: {

                     System.out.println("Enter your Employee ID for update salary:");

                     int upadateId = sc.nextInt();
                      boolean found = false;

                        for (Employees emp : employees) {

                          if (emp.id == upadateId) {

                            System.out.println("Please Enter your updated Salary");

                             emp.salary = sc.nextDouble();

                               System.out.println("Your salary is updated");

                                found = true;
                                    break;
                                            }
                                                  }

                      if (!found) {
                               System.out.println("Please enter a valid ID");
                                      }

                                      break;
									  
									  
                                           }
										   
	 				 case 5: {
         while(true){
         System.out.print("Enter Employee ID to Search: ");
	   
	     if(employees.isEmpty()){
		  System.out.println("No Employee available.");
	    }
        int searchId = sc.nextInt();
     for(Employees e : employees){
		 if( e.id == searchId){
			   System.out.println("\nEmployee Found:");
			   e.display();
			  
			  return;
			 
		 }
		 else{
			 System.out.println("Employee ID Not Found!");
			 break;
		 }
		 
	  
  }
          
   
					 }}

case 11: {
	System.out.println(" Successfully exit");
	System.exit(0);
	
		    }
}			   
				
		
	    }
		catch(InputMismatchException e){
			System.out.println("Invalid Input");
			
			sc.nextLine();
			
		}
	
    }
	
	}
    
}