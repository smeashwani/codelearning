package codelearning.basic.reflection;

import java.lang.reflect.Method;

public class AnnotationReader {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Employee employee = new Employee();
		Method method = employee.getClass().getMethod("toString");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		System.out.println("value is: " + annotation.value());
		System.out.println("value is: " + annotation.value2());
	}
}
