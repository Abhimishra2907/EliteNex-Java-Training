
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
		System.out.println("\n========== STUDENT RESULT ==========");
		System.out.println(" Student RollNo. : " + rollNo);
		System.out.println(" Student Name     : " + name);
		System.out.println(" Maths Marks     : " + maths);
		System.out.println(" Science Marks   : " + science);
		System.out.println(" English Marks   : " + english);
		System.out.println(" "); 
		System.out.println(" Total Marks     : " + calculateTotal());
        System.out.println(" Percentage      : " + calculatePercentage());
		System.out.println(" Grade           : "+  calculateGrade()); 
		
		System.out.println(" ");
		
	}
	
	public static void main ( String [] args){
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter RollNo.");
		int rollNo = sc.nextInt();
		sc.nextLine();
		
	System.out.println("======= STUDENT RESULT PROCESSOR =======");
		 
		
		
        System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		
		int maths;
while(true){
    System.out.print("Enter Maths Marks : ");
    maths = sc.nextInt();

    if(maths >= 0 && maths <= 100){
        break;
    }

    System.out.println("Invalid Maths Marks! Please enter between 0 and 100.");
}
		
		 int science;
while(true){
    System.out.print("Enter Science Marks : ");
    science = sc.nextInt();

    if(science >= 0 && science <= 100){
        break;
    }

    System.out.println("Invalid Science Marks! Please enter between 0 and 100.");
}
		
		int english;
while(true){
    System.out.print("Enter English Marks : ");
    english = sc.nextInt();

    if(english >= 0 && english <= 100){
        break;
    }

    System.out.println("Invalid English Marks! Please enter between 0 and 100.");
}
		
		StudentResultProcessor student = new  StudentResultProcessor(rollNo,name,maths,science,english);
		
		student.displayResult();
		
		sc.close();
		
		
	}
	}