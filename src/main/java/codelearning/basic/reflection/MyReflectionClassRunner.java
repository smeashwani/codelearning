package codelearning.basic.reflection;

import java.lang.reflect.Modifier;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MyReflectionClassRunner {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class clz = Employee.class;
		//Employee e = new Employee();
		//Class clz =e.getClass();
		Class clz = Class.forName("codelearning.basic.reflection.Employee");
		System.out.println(clz.getCanonicalName());
		System.out.println(clz.getName());
		System.out.println(clz.isEnum());
		System.out.println(clz.isInterface());
		System.out.println(clz.getSuperclass());
		System.out.println(Modifier.toString(clz.getModifiers()));
		
		System.out.println("Classloader of this class:"+ MyReflectionClassRunner.class.getClassLoader());
		System.out.println("Classloader of Logging:"+ Logger.class.getClassLoader());
		System.out.println("Classloader of ArrayList:"+ ArrayList.class.getClassLoader());
	}
}


