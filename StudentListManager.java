import java.util.ArrayList;
import java.util.List;
public class StudentListManager {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ahmed");
        students.add("Ali");
        students.add("Sara");
        students.add("Fatima");
        students.add("Omar");
        students.add("Hassan");
        students.add("Mariam");
        students.add("Khalid");
        students.add("Noura");
        students.add("Yousef");
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("\nTotal Number of Students: " + students.size());

        System.out.println("First Student: " + students.get(0));

        System.out.println("Last Student: " + students.get(students.size() - 1));
        String searchStudent = "Sara";
        if (students.contains(searchStudent)) {
            System.out.println(searchStudent + " exists in the list.");
        } else {
            System.out.println(searchStudent + " does not exist in the list.");
        }
        students.remove("Omar");
        System.out.println("\nUpdated Student List After Removing Omar:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}