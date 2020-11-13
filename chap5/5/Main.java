class Employee {

	Employee(){
		System.out.println("Employee()");
	}

	Employee(String name){
		System.out.println("Employee(String name)");
	}

	Employee(int id){
		System.out.println("Employye(int id)");
	}

	Employee(int id, String name){
		System.out.println("Employee(int id, String name)");
	}
}

public class Main {
	public static void main(String[] args) {
		Employee a = new Employee();
		Employee b = new Employee("ueda");
		Employee c = new Employee(26);
		Employee d = new Employee(26, "ueda");
	}
}