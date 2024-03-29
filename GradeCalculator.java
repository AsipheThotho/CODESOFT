package gradecalculator;

import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

       for (int i = 1; i <= numberOfSubjects; i++) {
        int marks;
    do {
        System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");// marks obtained (out of 100) in each subject
        marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        }
        
    } while (marks < 0 || marks > 100); // Loops until valid input is provided
    
        totalMarks += marks;// Summing up the marks obtained in all subjects.

    }

    /* Dividing the total marks by the total number of subjects to get the average percentage,
   and casting the variable totalMarks to a double for more accurate averagePercentage */
    
        double averagePercentage = totalMarks / numberOfSubjects;

        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

    }
}

