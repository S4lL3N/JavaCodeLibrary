package ExamOne; //INTELLIJ MIGHT CHANGE THIS DEPENDING ON HOW THE PROJECT GETS IMPORTED, THAT'S OKAY

import java.util.ArrayList;

public class Assignment {
    //TODO Implement the Assignment class per UML document
    private String assignmentName;
    private ArrayList<Grade> grades = new ArrayList<>();

    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
    public void addGrade(String studentName, float grade){
        grades.add(new Grade(studentName,grade));

    }
    public float calculateAverageGrade(){
        float total = 0;
        float average;
        for(Grade value : grades){
            total += value.getGrade();
        }
        average = total / grades.size();

        return average;

    }
}
