class Employee {
	int id;

	void setId(int i){
		id = i;
	}

	int getId(){
		return id;
	}
}

public class Main {
	public static void main(String[] args) {
		Employee a = new Employee();

		a.setId(100);

		Employee b = new Employee();

		b.setId(200);

		System.out.println("Aさん	:" + a.getId());
		System.out.println("Bさん	:" + b.getId());
	}
}