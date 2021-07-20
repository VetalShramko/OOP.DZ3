package dz;

public class Person {
	private String name;
	private String surname;
	private int age;
	private GenderPerson gender;
	public Person(String name, String surname, int age, GenderPerson gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public GenderPerson getGender() {
		return gender;
	}
	public void setGender(GenderPerson gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
