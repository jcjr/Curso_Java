package entities;

public class Pessoas {
	private String name;
	private int age;
	private double height;
		
	public Pessoas() {
		this.name = "";
		this.age = 0;
		this.height = 0.0;
	}

	public Pessoas(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Pessoas(Pessoas pessoas) {
		this.name = pessoas.name;
		this.age = pessoas.age;
		this.height = pessoas.height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
