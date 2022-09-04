package codelearning.basic.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1905144961568353043L;
	private String name;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pwd=" + "]";
	}
	public Employee(String name, String password) {
		super();
		this.name = name;
		this.password =password;
	}
	public Employee () { }

}
