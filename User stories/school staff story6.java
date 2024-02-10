import java.util.ArrayList;
import java.util.List;

public class StudentAttendanceSystem {



public static void main(String[] args) {
    // Create an instance of the StudentAttendanceTracker
    StudentAttendanceTracker attendanceTracker = new StudentAttendanceTracker();

    // Mark attendance for students (this is a simplified example)
    attendanceTracker.markAttendance("S001", true);
    attendanceTracker.markAttendance("S002", false);
    attendanceTracker.markAttendance("S003", true);
    // Add more students as needed

    // Generate the list of students for the next day's route
    List<String> presentStudents = attendanceTracker.getPresentStudents();
    List<String> absentStudents = attendanceTracker.getAbsentStudents();

    // Display the lists
    System.out.println("Students who will come the next day:");
    presentStudents.forEach(System.out::println);

    System.out.println("\\nStudents who won't come the next day:");
    absentStudents.forEach(System.out::println);
}
}

class StudentAttendanceTracker {
    private List<String> presentStudents = new ArrayList<>();
    private List<String> absentStudents = new ArrayList<>();



public void markAttendance(String studentId, boolean isPresent) {
    if (isPresent) {
        presentStudents.add(studentId);
    } else {
        absentStudents.add(studentId);
    }
}

public List<String> getPresentStudents() {
    return presentStudents;
}

public List<String> getAbsentStudents() {
    return absentStudents;
}
}
