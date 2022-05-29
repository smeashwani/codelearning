package codelearning.basic.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8731229483490182521L;
	
	private String name;
	static private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pwd=" + pwd + "]";
	}
	public Employee(String name, int age, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	public Employee () { }

}
