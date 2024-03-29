package  StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    
    private String name;
    private int rollNumber;
    private String grade;
   

    public Student(String name, int rollNumber, String grade) {
        
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Getters and setters for getting access to the private fields of the Student class (name, rollNumber, and grade)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class StudentManagementSystem {
    
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + 
                                "\n Roll Number: " + student.getRollNumber() + 
                                "\n Grade: " + student.getGrade());
        }
    }
}

public class  Student_Managemnt_System {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         StudentManagementSystem sMS = new StudentManagementSystem();

        while (true) {
            
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();
                    sMS.addStudent(new Student(name, rollNumber, grade));
                    
                    break;
                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int removeRollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    sMS.removeStudent(removeRollNumber);
                    
                    break;
                case 3:
                    System.out.print("Enter roll number of student to search: ");
                    int searchRollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Student searchedStudent = sMS.searchStudent(searchRollNumber);
                    if (searchedStudent != null) {
                        System.out.println("Student found - Name: " + searchedStudent.getName() +
                                ", Roll Number: " + searchedStudent.getRollNumber() +
                                ", Grade: " + searchedStudent.getGrade());
                    } else {
                        System.out.println("Student not found.");
                        
                    }
                    break;
                case 4:
                    sMS.displayAllStudents();
                    
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    
                    break;
            }
        }
    }
}
