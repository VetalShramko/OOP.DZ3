package dz;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Ivan", "Ivanov", 25,GenderPerson.male, 1310, "JavaOOp");
		Student st2 = new Student("Petr", "Petrov", 22,GenderPerson.male, 2210, "JavaOOp");
		Student st3 = new Student("Katerina", "Juk", 27,GenderPerson.female, 1511, "JavaOOp");
		Student st4 = new Student("Lev", "Tolstoj", 38,GenderPerson.male, 1316, "JavaOOp");
		Student st5 = new Student("Dmitriy", "Suhanov", 35,GenderPerson.male, 2111, "JavaOOp");
		Student st6 = new Student("Olha", "Ruda", 22,GenderPerson.female, 2315, "JavaOOp");
		Student st7 = new Student("Inna", "Bura", 30,GenderPerson.female, 1360, "JavaOOp");
		Student st8 = new Student("Oleg", "Sidorov", 26,GenderPerson.male, 1234, "JavaOOp");
		Student st9 = new Student("Irina", "Ivanova", 25,GenderPerson.female, 1220, "JavaOOp");
		Student st10 = new Student("Taras", "Nogin", 37,GenderPerson.male, 1300, "JavaOOp");
		Student st11 = new Student("Taras", "Nogin", 38,GenderPerson.male, 7701, "JavaOOp");
		
		Group group1= new Group("Java");
		group1.addStudent(st1);
		group1.addStudent(st2);
		group1.addStudent(st3);
		group1.addStudent(st4);
		group1.addStudent(st5);
		group1.addStudent(st6);
		group1.addStudent(st7);
		group1.addStudent(st8);
		group1.addStudent(st9);
		group1.addStudent(st10);
		group1.addStudent(st11);
		
		group1.delStudent(st8);
		System.out.println("Search Student - " + group1.search("Ruda"));
		System.out.println(group1.toString());
		
	}
	
	}



