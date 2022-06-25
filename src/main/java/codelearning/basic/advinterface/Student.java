package codelearning.basic.advinterface;

public class Student implements MyInterface {

	@Override
	public String getName() {
		return "Student";
	}
	
	void print() {
		//asdf//asdfasdf
		System.out.println("welcome1");
	}

	
	public void display() {
		MyInterface.super.display();
		int arr[] = {1,2,3,4};
		
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("display...");
	}

}
