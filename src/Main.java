//import java.util.*;
public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createStudent();
                    break;
                case 2:
                	Manager.findAndSort();
                    break;
                case 3:
                	Manager.updateOrDelete();
                    break;
                case 4:
                	Manager.report();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }
}