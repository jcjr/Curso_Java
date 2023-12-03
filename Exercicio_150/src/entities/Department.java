package entities;

public class Department {
	
	private String name;
	
	public Department() {
		
	}

	public Department(String name) {
		this.name = name;
	}
	
	public Department(Department department) {
		this.name = department.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
