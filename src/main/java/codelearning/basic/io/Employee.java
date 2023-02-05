package codelearning.basic.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends EmployeeParent implements Externalizable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" +age+ "]";
	}
	
	public Employee () { }
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
		out.writeUTF(companyName);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
		companyName = in.readUTF();
	}

}
