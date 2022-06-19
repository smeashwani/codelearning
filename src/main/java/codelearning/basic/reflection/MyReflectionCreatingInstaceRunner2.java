package codelearning.basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyReflectionCreatingInstaceRunner2 {
	public static void main(String[] args) throws ClassNotFoundException{
		Class clz = Employee.class;
		try {
			Employee e = (Employee) clz.newInstance();
			System.out.println(e);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


