import java.util.Scanner;  
public abstract class payroll {
  public abstract void main(String[] args);
	public payroll(Scanner input) {
     // prompt user to enter information
		System.out.println("Enter the Employee's information");
		System.out.print("Enter Employess's Name:");
		 input.nextLine();
		 System.out.print("Enter numbers hours worked:");
		 input.nextLine();
		 System.out.print("Enter hourly pay:");
		 input.nextLine();
		 System.out.print("Enter Federal withholding rate:");
	     input.nextLine();
	     System.out.print("Enter State Tax Withholding rate:");
	     input.nextInt();
	     

	}

}
