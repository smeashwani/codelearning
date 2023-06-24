package codelearning.basic.lombok.api;

import lombok.Builder;

@Builder
public class EmployeeBuilder {
	String name;
	String password;
	int age;
}
class Runner1{
	public static void main(String[] args) {
		EmployeeBuilder obj =EmployeeBuilder.builder()
				.password("pass")
				.age(25)
				.name("Guest")
				.build();
	}
}