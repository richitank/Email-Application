package emailapp;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "aeycompany.com";
	
    //Constructor to receiver firstname and lastname
	
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("Email Created: " + this.firstName + "" + this.lastName);
		
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		                            
		//Call a method that return random pswd
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is :"+ this.password);
		
		
		//combine elements to generate email
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
		//System.out.println("Your email is :"+ email);
		
		
	}
	
	
	//ask for department
	private String setDepartment() {
		System.out.println("New worker :" +firstName+"\ndepartment codes:  \n1 for sales\n2 for development\n3 for Acounting\n0 for nothing \nEnter Department Code:");
	    
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1)
		{
			return "Sales";
		}
		
		else if (deptChoice == 2) {return "Development";}
		else if (deptChoice == 3) {return "Accounting";}
		else {return "";}
		
		
	
	}
	// generate random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$#*%";
		char[] password = new char[length];
		for (int i=0 ; i<length ; i++) {
		
		int rand =	(int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);	
		}
		
		return new String (password);
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		
		this.mailboxCapacity = capacity;
	}
	
	
	
	//set the alternate email
	
	public void setAlternateEmail (String altEmail) {
		
		this.alternateEmail = altEmail;
	}
	
	//change the passwords
	public void changePassword(String password) {
		
		this.password = password;
	}
	
	public int getMailboxCapacity (){return mailboxCapacity; }
	
	public String getALternateEmail() {return alternateEmail;}
	
	
	public String getPassword () {return password;}
	
	public String showInfo() {
		return  
			"diplayName: " + firstName +""+ lastName +
			"\nComapny email:"+email+
			"Mailbox capacity:"+ mailboxCapacity +"m";}
}
