package codelearning.basic.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnnotation{
	
	 int value();
	 String value2() default "xyz";   
	 String value3() default "value3";  //String value3() default "xyz";  
} 