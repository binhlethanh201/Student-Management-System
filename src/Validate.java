import java.util.*;
public class Validate {
	private static final Scanner sc = new Scanner(System.in);
	
	public static int checkInputLimit(int min, int max) {
		while(true) {
			try {
				int in = Integer.parseInt(sc.nextLine());
				if(in < min || in > max) {
					throw new NumberFormatException();
				}
				return in;
			} catch(NumberFormatException e) {
				System.err.println("Please input on the range : " +min+ " to " +max);
				System.out.print("Try again: ");
			}
		}
	}
	
	public static String checkInputId() {
		while(true) {
			String in = sc.nextLine().trim();
			if (in.matches("SE\\d{2}")) {

				return in;
			} else {
				 System.err.println("Invalid format! ID must be in the format 'SExx' (e.g., SE12).");
			}
			 System.out.print("Try again: ");		
		}
	}
	public static boolean checkIdExist( ArrayList<Student> st, String id) {
		for(Student students : st) {
			if(id.equalsIgnoreCase(students.getId())) {
				return true;
			}
		}
		return false;
	}
	
	
	public static String checkInputString() {
	    while (true) {
	        String in = sc.nextLine().trim();
	        if (in.length() == 0) {
	            System.err.println("Cannot be empty. Try again.");
	            continue;
	        }
	        return in;
	    }
	}
	
	public static String checkInputCourse() {
		while(true) {
			String in = sc.nextLine().trim();
			if(in.equalsIgnoreCase("Java") || in.equalsIgnoreCase(".Net") || in.equalsIgnoreCase("C/C++")) {
				return in;
			}
			System.err.println("Invalid course!");
			System.out.print("Try again: ");
		}
	}
	
	public static boolean checkStudentExist(ArrayList<Student> st, String id, String studentName, String semester, String courseName) {
		for(Student students : st) {
			if(id.equalsIgnoreCase(students.getId()) && studentName.equalsIgnoreCase(students.getStudentName()) && semester.equalsIgnoreCase(students.getSemester())
					&& courseName.equalsIgnoreCase(students.getCourseName())) {
				return false;
			}
		}
		return true;
	}
	
	
}
