package company;

public class employee {
	private String firstName;
	private String lastName;
	private int salary;
	private String Email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return Email;
		}
	
	public String returnEmail() {
		String email = this.firstName +"."+ this.lastName +"@redbone.com";
		
		return email;
		
	}
	
	public String getFullname() {
		String fullName = this.firstName +" "+ this.lastName;
		
		return fullName;
		
	}
	
	employee(String fName, String lName, int sal){
		this.firstName = fName;
		this.lastName = lName;
		this.salary = sal;
		this.Email = returnEmail();
	}
	
	
}
