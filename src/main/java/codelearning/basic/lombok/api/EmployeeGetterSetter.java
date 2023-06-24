package codelearning.basic.lombok.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


public class EmployeeGetterSetter {
	
	
	@Setter(AccessLevel.PROTECTED) 
	Long id;
	
	@Setter
	@Getter
	String name;
	
	@Getter
	int age;
	
	
	@Getter(lazy = true)
	private final String name1 = getName();
	
	
	
	public String getName() {
		return "from database";
	}
	
}
