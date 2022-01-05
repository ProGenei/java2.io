package assignment_2;



public class Student {
    private String studName;
    private String studID;
    private float studGPA;
    private double studGrade;
    static int studentsCounter;
    Student() {
        
    }
    

    Student(String studID, String studName, float studGPA, double studGrade) {
        this.studName = studName;
        this.studID = studID;
        this.studGPA = studGPA;
        this.studGrade = studGrade;
    }
    public String GetStudName() {
        return studName;
    }
    public String GetStudID() {
        return studID;
    }
    public float GetStudGPA() {
        return studGPA;
    }
    public void SetStudName(String studName) {
        this.studName = studName;
    }
    public void SetStudID(String studID) {
        this.studID = studID;
    }
    public void SetStudName(float studGPA) {
        this.studGPA = studGPA;
    }
    public void SetStudGrade(double studGrade) {
        this.studGrade = studGrade;
    }
    
    public double GetStudGrade() {
        return studGrade;
    }
    public int GetStudentsCounter() {
        return studentsCounter;
    }
}
