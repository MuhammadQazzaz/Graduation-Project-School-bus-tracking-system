import java.util.HashMap;
import java.util.Map;

public class StudentManagementSystem {



public static void main(String[] args) {
    // Create a map to store student information
    Map<String, Student> studentMap = new HashMap<>();

    // Populate student information
    studentMap.put("S001", new Student("S001", "John Doe", 10));
    studentMap.put("S002", new Student("S002", "Jane Smith", 11));
    // Add more students as needed

    // Display information for each student
    for (Student student : studentMap.values()) {
        System.out.println(student.getInformation());
    }
}
}

class Student {
    private String studentId;
    private String studentName;
    private int gradeLevel;



public Student(String studentId, String studentName, int gradeLevel) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.gradeLevel = gradeLevel;
}

public String getStudentId() {
    return studentId;
}

public String getStudentName() {
    return studentName;
}

public int getGradeLevel() {
    return gradeLevel;
}

public String getInformation() {
    return "Student ID: " + studentId + "\\nName: " + studentName + "\\nGrade Level: " + gradeLevel + "\\n";
}
}
