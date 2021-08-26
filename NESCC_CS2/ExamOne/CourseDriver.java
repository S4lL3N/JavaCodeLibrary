/*
 * Name: Shae Allen
 * Course: CISP-1020-A70
 * Date: 4/2/2020
 * Exam1
 */
package ExamOne; //INTELLIJ MIGHT CHANGE THIS DEPENDING ON HOW THE PROJECT GETS IMPORTED, THAT'S OKAY

import java.util.ArrayList;

// 1. DO NOT CHANGE ANY EXISTING CODE BELOW. YOUR ADDITION MUST WORK TO THE UML SPECIFICATION PROVIDED
// 2. ANY CHANGES TO EXISTING CODE WILL NOT MEET SPECIFICATION AND LOSE POINTS
// 3. IT IS ADVISED THAT YOU IMPLEMENT GRADE AND ASSIGNMENT CLASSES FIRST
// 4. THE DRIVER WILL NOT WORK UNTIL ALL DEPENDENCIES HAVE BEEN CREATED (GRADE AND ASSIGNMENT)
// 5. NO USER INPUT IS REQUIRED, HARD CODE THE VALUES THAT YOU ARE ADDING TO THE ASSIGNMENT BELOW
public class CourseDriver {
    public static void main(String[] args) {
        ArrayList<Assignment> assignments = new ArrayList<>();

        Assignment assignment1 = new Assignment("Exam 1");
        Assignment assignment2 = new Assignment("Exam 2");

        //TODO Write the code to add 4 grades to assignment1, you pick the values
        assignment1.addGrade("joe", 90);
        assignment1.addGrade("bob", 100);
        assignment1.addGrade("steve", 85);
        //TODO Write the code to add 3 grades to assignment2, you pick the values
        assignment2.addGrade("joe",72);
        assignment2.addGrade("bob", 88);
        assignment2.addGrade("steve", 100);

        //TODO write the code to add assignment1 and assignment2 to the assignments ArrayList
        assignments.add(assignment1);
        assignments.add(assignment2);

        for(Assignment a: assignments){
            System.out.println("Assignment:" + a.getAssignmentName());
            System.out.println("Average Grade:" + a.calculateAverageGrade());
            for (Grade grades: a.getGrades()) {
                System.out.println(grades.toString());
            }
        }
    }
}
