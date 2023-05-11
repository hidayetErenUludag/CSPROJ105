package CsHomework5;

public class FileReadingTest {
    public static void main(String[] args) {
        School özyeğin = new School();
        System.out.println(özyeğin.readCourses());
        System.out.println(özyeğin.readStudents());
        özyeğin.calculateTotalCreditFor("384");
        özyeğin.calculateTotalCreditFor("382");
        özyeğin.printStudentsEnrolledCourse("CS201");
        özyeğin.printCoursesEnrolledByStudent("384");
        özyeğin.printAllStudentsOrderByName();
    }

}
