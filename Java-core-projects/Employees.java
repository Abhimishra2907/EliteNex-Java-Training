import java.time.LocalDate;
class Employees{
	public int id;
	public String name;
	public String department;
	public double salary;
	public LocalDate joiningDate;
	


Employees(int id, String name,String department, double salary, LocalDate joiningDate){
	this.id = id;
	this.name= name;
	this.department = department;
	this.salary = salary;
	this.joiningDate = joiningDate;
	
}

  public void display(){
	  System.out.println("-------------------------------------");
	  System.out.println(" System Employees Details ");
	  System.out.println("--------------------------------------");
	  System.out.println(" Id : " + id);
	  System.out.println(" Name : " + name);
	  System.out.println(" Department : " + department);
	  System.out.println(" Salary : " + salary );
	  System.out.println(" JoiningDate : " + joiningDate);
	
  }
  
	
public static void main(String [] args){
	Employees emp1 =
	new Employees
	(101,
	"Abhishek",
	"it",
	25000,
	LocalDate.of(2026, 6, 9)
	);
	
	Employees emp2 =
	new Employees
	(102,
	"Abhi",
	"it",
	35000,
	LocalDate.of(2026, 6, 9)
	);
	emp1.display();
	emp2.display();
}}