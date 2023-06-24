package codelearning.basic.lombok.api;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class EmployeeEquals {
	String name;
	String password;
	int age;
}
