import algorithm.Algorithm;
import mai.edu.lesson_2.lib.Student;; 

public class MyTestAlgorithm {

	public static void main(String[] args) {
		int A[] = {3, 13, 56, 49, 55, 87, 5, 6, 15, 25, 44, 0, 7, 1, 55};
		
		Student[] students = new Student[4];
		students[0] = new Student("Иван", "Иванов");
		students[0].passMath(3);
		students[0].passPhys(3);
		students[0].passProg(3);
		
		students[1] = new Student("Петр", "Петров");
		students[1].passMath(4);
		students[1].passPhys(4);
		students[1].passProg(4);

		students[2] = new Student("Григорий", "Семенов");
		students[2].passMath(5);
		students[2].passPhys(5);
		students[2].passProg(5);

		students[3] = new Student("Ольга", "Иванова");
		students[3].passMath(5);
		students[3].passPhys(5);
		students[3].passProg(4);

		Algorithm.sort(students, Algorithm.ASC);
//		Arrays.sort(students, Collections.reverseOrder());
	
		for(Student stud : students)
			System.out.println(stud);
		
		

		
	}

}
