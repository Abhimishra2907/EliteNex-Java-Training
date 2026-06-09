
import java.util.Scanner;
class StudentResultProcessor{
	private int rollNo ;
	private String name;
	private int maths;
	private int science;
	private int english;
	
	public StudentResultProcessor(int rollNo,String name,int maths,int science,int english){
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public int calculateTotal(){
		return maths + science + english;
	}
	public double calculatePercentage(){
		return  calculateTotal()/3.0;
		
	}
	
	public String calculateGrade(){
		double percentage = calculatePercentage();
		
		if(percentage>=90)
			return"A+";
		
		
		else if(percentage >= 80)
			return"A" ;
			
			else if (percentage >= 70)
			return"B+" ;
			
			else if(percentage >= 60)
			return"B" ;
			
			else if(percentage >= 50)
			return"C" ;
			
			else if(percentage >= 40)
			return"D" ;
			
			else
				return
					"FAIL";
				
		
	}
	
	public void displayResult(){
		System.out.println("\n ==== Student Result ===");
		System.out.println(" RollNo. : " + rollNo);
		System.out.println(" Name : " + name);
		System.out.println(" Maths : " + maths);
		System.out.println(" Science : " + science);
		System.out.println(" English : " + english);
		System.out.println(" CalculateTotal No. : " + calculateTotal());
		System.out.println(" calculatePercentage : " + calculatePercentage());
		System.out.println(" calculateGrade : "+  calculateGrade());
		
		System.out.println(" ");
		
	}
	
	public static void main ( String [] args){
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter RollNo.");
		int rollNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("======= Student Result Process ====");
		 
		
		
        System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter Maths Marks : ");
		int maths = sc.nextInt();
	
		if(maths<0||maths>100){
			  System.out.println("Invalid Marks! Marks should be between 0 and 100.");
               return;
		 }
		 
		System.out.println("Enter Science Marks : ");
		int science = sc.nextInt();
		
		if(science<0||science>100){
			  System.out.println("Invalid Marks! Marks should be between 0 and 100.");
               return;
		 }
		 
		
		System.out.println("Enter english Marks : ");
		int english = sc.nextInt();
		
		if(english<0||english>100){
			  System.out.println("Invalid Marks! Marks should be between 0 and 100.");
               return;
		 }
		
		StudentResultProcessor student = new  StudentResultProcessor(rollNo,name,maths,science,english);
		
		student.displayResult();
		
		sc.close();
		
		
	}
	}