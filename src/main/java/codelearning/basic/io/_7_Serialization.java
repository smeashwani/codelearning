package codelearning.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _7_Serialization {
	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.name="ducat";
		emp.password="pass";
		emp.companyName="DUCAT";

		
		try( FileOutputStream fos = new FileOutputStream("save.ser1");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			oos.writeObject(emp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try( FileInputStream fos = new FileInputStream("save.ser1");
				ObjectInputStream oos = new ObjectInputStream(fos);
			){
			Employee obj = (Employee)oos.readObject();
			System.out.println(obj);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
