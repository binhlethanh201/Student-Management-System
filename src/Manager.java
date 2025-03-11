import java.util.*;
public class Manager {
	private static final ArrayList<Student> students = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);
	
	public static int menu() {
		System.out.println();
		System.out.println("===== STUDENT MANAGEMENT =====");
		System.out.println("1. Create Student");
		System.out.println("2. Find and Sort Student");
		System.out.println("3. Update or Delete Student");
		System.out.println("4. Report");
		System.out.println("5. Exit");
		System.out.print("Please choose one option: ");
		int choice = Validate.checkInputLimit(1, 5);
		return choice;
	}
	public static void createStudent() {
		while(true) {
			System.out.println("----- Create Student ------");
			System.out.print("Enter ID: ");
			String id = Validate.checkInputId();
			if(Validate.checkIdExist(students, id)) {
				System.err.println("Student with this ID already exists.");
				System.out.print("Try again: ");
			}
			System.out.print("Enter Name: ");
			String name = Validate.checkInputString();
			System.out.print("Enter Semester: ");
			String semester = Validate.checkInputString();
			System.out.print("Enter Course name: ");
			String courseName = Validate.checkInputCourse();
			Student student = new Student(id,name,semester,courseName);
			
			  if (!Validate.checkStudentExist(students, id, name, semester, courseName)) {
	                System.err.println("Student with this information already exists!");
	            } else {
	                students.add(student);
	                System.out.println("Student added successfully.");
	            }

	            if (students.size() >= 10) {
	                System.out.print("Do you want to continue? (Y/N): ");
	                if (!sc.nextLine().trim().equalsIgnoreCase("Y")) break;
	           }
			
			}
		}
	public static void findAndSort() {
	    System.out.print("Enter name to search: ");
	    String search = sc.nextLine().trim().toLowerCase(); 

	    List<Student> result = new ArrayList<>();
	    
	    for (Student s : students) {
	        if (s.getStudentName().toLowerCase().contains(search)) { 
	            result.add(s);
	        }
	    }
	    
	    if (result.isEmpty()) {
	        System.out.println("No students found.");
	        return;
	    }
	    result.sort(Comparator.comparing(Student::getStudentName));
	    System.out.println("===== Search Result =====");
	    for (Student s : result) {
	        System.out.println(s.getId()+ " | " +s.getStudentName() + " | " + s.getSemester() + " | " + s.getCourseName());
	    }
	}

    public static void updateOrDelete() {
    	System.out.print("Enter Student ID: ");
        String id = sc.nextLine().trim();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("Do you want to update (U) or delete (D)? ");
                String choice = sc.nextLine().trim().toUpperCase();
                if ("U".equals(choice)) {
                	System.out.print("Enter new Name:  ");
                    s.setStudentName(sc.nextLine());
                    System.out.print("Enter new Semester: ");
                    s.setSemester(sc.nextLine());
                    System.out.print("Enter new Course: ");
                    s.setCourseName(sc.nextLine());
                    System.out.println("Student updated.");
                } else if ("D".equals(choice)) {
                    students.remove(s);
                    System.out.println("Student deleted.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void report() {
        Map<String, Integer> reportData = new HashMap<>();
        for (Student s : students) {
            String key = s.getId() + " | " + s.getStudentName()+ " | " +s.getSemester() + " | " +s.getCourseName();
            reportData.put(key, reportData.getOrDefault(key, 0) + 1);
        }
        System.out.println("===== Report Result =====");
        reportData.forEach((key, value) -> System.out.println(key + " | " + value));
    }
	
}
