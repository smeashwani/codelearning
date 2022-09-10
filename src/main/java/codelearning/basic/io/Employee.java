package codelearning.basic.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends EmployeeParent implements Externalizable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7341095861939601609L;

	String name;
	String password;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pwd=" + password + companyName+"]";
	}
	public Employee () { }
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.writeUTF(companyName);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		companyName = in.readUTF();
	}

}
