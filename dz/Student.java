package dz;

public class Student extends Person {
	private long studNumber;
	private String studGroup;

	
	public Student(String name, String surname, int age, GenderPerson gender, long studNumber, String studGroup) {
		super(name, surname, age, gender);
		this.studNumber = studNumber;
		this.studGroup = studGroup;
	}

	

	public Student() {
		super();
	}

	public long getStudNumber() {
		return studNumber;
	}



	public void setStudNumber(long studNumber) {
		this.studNumber = studNumber;
	}



	public String getStudGroup() {
		return studGroup;
	}



	public void setStudGroup(String studGroup) {
		this.studGroup = studGroup;
	}



	@Override
	public String toString() {
		return "Student [studNumber=" + studNumber + ", studGroup=" + studGroup + " " + super.toString() + "]";
	}

}
