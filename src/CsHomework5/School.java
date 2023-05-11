package CsHomework5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class School {
    HashMap<String, String[]> studentMap = new HashMap<>();
    HashMap<String, String[]> courseMap = new HashMap<>();

    public HashMap<String, String[]> readCourses() {
        String filePath = "/Users/erenuludag/Documents/GitHub/CSPROJ105/src/CsHomework5/Courses.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] list = line.split(";");
                courseMap.put(list[0], list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseMap;
    }

    public HashMap<String, String[]> readStudents() {
        String filePath = "/Users/erenuludag/Documents/GitHub/CSPROJ105/src/CsHomework5/Students.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] list = line.split(";");
                studentMap.put(list[0], list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentMap;
    }

    public void calculateTotalCreditFor(String studentId) {
        int credit;
        String[] studentClass = studentMap.get(studentId);
        String[] points = courseMap.get(studentClass[2]);
        try {
            String[] points1 = courseMap.get(studentClass[3]);
            credit = Integer.parseInt(points[2]);
            credit += Integer.parseInt(points1[2]);
            System.out.println("You have requested the " + studentId + " " + studentClass[1] + "'s total credit\n" + credit);
        } catch (ArrayIndexOutOfBoundsException e) {
            credit = Integer.parseInt(points[2]);
            System.out.println("You have requested the " + studentId + " " + studentClass[1] + "'s total credit\n" + credit);
        }
    }

    public void printStudentsEnrolledCourse(String courseCode) {
        System.out.println("The students who enrolled in this course");
        for (Map.Entry<String, String[]> entry : studentMap.entrySet()) {
            String[] value = entry.getValue();
            if (value.length >= 3 && value[2].equals(courseCode)) {
                System.out.println("Student ID: " + value[0]);
                System.out.println("Student Name: " + value[1]);
                System.out.println("Enrolled in Course: " + courseCode);
            } else if (value.length >= 4 && value[3].equals(courseCode)) {
                System.out.println("Student ID: " + value[0]);
                System.out.println("Student Name: " + value[1]);
                System.out.println("Enrolled in Course: " + courseCode);
            }
        }
    }
    public void printCoursesEnrolledByStudent(String studentNum){
        String[] studentInfo = studentMap.get(studentNum);
        if (studentInfo.length ==3 ){
            System.out.println("The Student is enrolled into only :" + studentInfo[2]);
            String[] courseInfo = courseMap.get(studentInfo[2]);
            System.out.println("Code of the course: " + courseInfo[0] + "\nName of the Course: " + courseInfo[1] +
                    " \nCredit of the course: " + courseInfo[2]);

        } else if (studentInfo.length > 3) {
            System.out.println("The student is enrolled into: " + studentInfo[2] + " and: " + studentInfo[3]);
            String[] courseInfo = courseMap.get(studentInfo[2]);
            System.out.println("Code of the course: " + courseInfo[0] + "\nName of the Course: " + courseInfo[1] +
                    "\nCredit of the course: " + courseInfo[2]);
            String[] courseInfo1 = courseMap.get(studentInfo[3]);
            System.out.println("Code of the course: " + courseInfo1[0] + "\nName of the Course: " + courseInfo1[1] +
                    "\nCredit of the course: " + courseInfo1[2]);
        }
    }
    public void printAllStudentsOrderByName() {
        String[] nameList = new String[studentMap.size()];
        int i = 0;
        for (Map.Entry<String, String[]> entry : studentMap.entrySet()) {
            String[] studentInfo = entry.getValue();
            if (studentInfo.length > 1) {
                String[] studentData = studentInfo[1].split(" ");
                String studentName = studentData[0];
                String studentSurname = studentData[1];
                String fullName = studentName + " " + studentSurname;
                nameList[i] = fullName;
                i++;
            } else {
            }
        }

        Arrays.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null && s2 == null) {
                    return 0;
                } else if (s1 == null) {
                    return 1;
                } else if (s2 == null) {
                    return -1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        for (String fullName : nameList) {
            System.out.println(fullName);
        }
    }

}




