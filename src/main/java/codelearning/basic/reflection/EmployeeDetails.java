package codelearning.basic.reflection;

public class EmployeeDetails extends Employee{
	public String publicAddress ="NOIDA";
	private String address;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
