package codelearning.basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MyReflectionMethodRunner {
	public static void main(String[] args) throws ClassNotFoundException{
		EmployeeDetails obj = new EmployeeDetails();
		Class clz = obj.getClass();
		Method[] declaredMethods = clz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
		}
		

	}
}


