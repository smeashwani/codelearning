package javafeature.java7;

public class Diamond {
	public static void main(String[] args) {
		MyClass<String> obj = new MyClass<>() {
			@Override
			public String get() {
				return null;
			}
		};
	}
}

abstract class MyClass<T>{
	public abstract T get();
}
