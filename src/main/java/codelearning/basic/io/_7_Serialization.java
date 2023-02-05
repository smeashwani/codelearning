package codelearning.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _7_Serialization {
	public static void main(String[] args) {
	
		save();
		
		read();
		
		
	}

	private static void read() {
		try( FileInputStream fos = new FileInputStream("save.ser");
				ObjectInputStream oos = new ObjectInputStream(fos);
			){
			Employee obj = (Employee)oos.readObject();
			System.out.println("Read :"+obj);
			System.out.println("Read :"+obj.companyName);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	private static void save() {
		Employee emp = new Employee();
		emp.name="ducat";
		emp.age=18;
		//emp.password="pass";
		emp.companyName="DUCAT";

		
		try( FileOutputStream fos = new FileOutputStream("save.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			oos.writeObject(emp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("save successfully "+emp);
	}
}
