package codelearning.basic.lombok.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"password","age"})
public class EmployeeToString {
	String name;
	String password;
	int age;

	

}
