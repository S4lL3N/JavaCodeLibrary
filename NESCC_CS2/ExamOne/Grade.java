package ExamOne; //INTELLIJ MIGHT CHANGE THIS DEPENDING ON HOW THE PROJECT GETS IMPORTED, THAT'S OKAY

public class Grade {
    //TODO Implement the Grade class per UML document
    private String studentName;
    private float grade;

    public Grade(String studentName, float grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grade{studentName=").append(studentName);
        sb.append(", grade=").append(grade).append("}");
        return sb.toString();
    }
}
