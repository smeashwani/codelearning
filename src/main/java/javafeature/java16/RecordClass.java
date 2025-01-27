package javafeature.java16;

public class RecordClass {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("code","type");
		System.out.println(v.getCode());
		System.out.println(v.getEngineType());
		
		VehicleRecord v1 = new VehicleRecord("code","type");
		System.out.println(v1.code());
		System.out.println(v1.engineType());
	}
}

 record VehicleRecord(String code, String engineType) {}

class Vehicle {
	String code;
	String engineType;

	// constructor
	public Vehicle(String code, String engineType) {
		this.code = code;
		this.engineType = engineType;
	}
	


	// getter and setter
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
