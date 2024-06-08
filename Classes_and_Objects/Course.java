public class Course {
    // Instance variables
    private String courseName;
    private String[] enrolledStudents;
    private int studentCount;

    // Static variable
    private static int maxCapacity;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new String[maxCapacity];
        this.studentCount = 0;
    }

    // Instance methods
    public void enrollStudent(String studentName) {
        if (studentCount < maxCapacity) {
            enrolledStudents[studentCount] = studentName;
            studentCount++;
            System.out.println(studentName + " has been enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll " + studentName + ". The course " + courseName + " is at full capacity.");
        }
    }

    public void unenrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                // Shift elements to remove the unenrolled student
                for (int j = i; j < studentCount - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[studentCount - 1] = null;
                studentCount--;
                System.out.println(studentName + " has been unenrolled from " + courseName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " is not enrolled in " + courseName);
        }
    }

    // Static method
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println("The maximum capacity for all courses has been set to " + maxCapacity);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Set the maximum capacity for courses
        Course.setMaxCapacity(2);

        // Create courses
        Course course1 = new Course("Object Oriented Programing With Java");
        Course course2 = new Course("Data Structure and Algorithms Using Java");

        // Enroll students in courses
        course1.enrollStudent("Krunal");
        course1.enrollStudent("jay");
        course1.enrollStudent("Meet");  // This should fail as max capacity is 2

        // Unenroll a student
        course1.unenrollStudent("Krunal");
        course1.unenrollStudent("Kirtan");

        // Try enrolling another student after unenrolling one
        course1.enrollStudent("Virat");

        // Enroll students in another course
        course2.enrollStudent("Rohit");
        course2.enrollStudent("Hardik");
    }
}
