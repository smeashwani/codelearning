package codelearning.basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyReflectionCreatingInstaceRunner2 {
	public static void main(String[] args) throws ClassNotFoundException{
		Class clz = Employee.class;
		try {
			//Employee e = (Employee) clz.newInstance(); // deprecated
			Employee e = (Employee) clz.getDeclaredConstructor().newInstance();
			Method privateMethod= Employee.class.getDeclaredMethod("test");
			privateMethod.setAccessible(true);
			privateMethod.invoke(e, null);
			
			System.out.println(e);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}


