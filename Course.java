package assignment_2;



public class Course {
    
    private String courseName;
    private String courseDays;
    private String courseTime;
    private String courseRoom;
    private String courseBuilding;
    private String courseInstructor;
    private Student[] registeredStudents;
    private  int num;
    private int index=0;
    private Student[] add_student;
    public Course() {
        
    
    }
    /*public Course(String courseName, int courseNumber, String courseDays, String courseTime, String courseRoom, String courseBuilding, String courseInstructor, int capacity) {
    
    }*/

    public Course(String courseName, String courseDays, String courseTime, String courseRoom, String courseBuilding, String courseInstructor,int num) {
        this.courseName = courseName;
        this.courseDays = courseDays;
        this.courseTime = courseTime;
        this.courseRoom = courseRoom;
        this.courseBuilding = courseBuilding;
        this.courseInstructor = courseInstructor;
        this.num=num;
    }
    
    public String GetCourseName() {
        return courseName;
    }
    public String GetCourseDays() {
        return courseDays;
    }
    public String GetCourseTime() {
        return courseTime;
    }
    public String GetCourseRoom() {
        return courseRoom;
    }
    public String GetCourseBuilding() {
        return courseBuilding;
    }
    public String GetCourseInstructor() {
        return courseInstructor;
    }
  //  public Student GetStudent(int index) {
        
   // }
    public Student[] GetAllStudents() {
        return registeredStudents;
    }
    public void SetCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void SetCourseDays(String courseDays) {
        this.courseDays = courseDays;
    }
    public void SetCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }
    public void SetCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }
    public void SetCourseBuilding(String courseBuilding) {
        this.courseBuilding = courseBuilding;
    }
    public void SetCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
    
    /**
     *
     * @param student
     */
    public void addStudent(Student student){
    
    if (index < num) {
        add_student[index]= student;
        index++;
    
    }
    
    }
}
    
//    @Override
//    public String toString() {
//    return "Course{" + "courseName=" + courseName + ", courseDays=" + courseDays + ", courseTime=" + courseTime + ", courseRoom=" + courseRoom + ", courseBuilding=" + courseBuilding + ", courseInstructor=" + courseInstructor + ", num=" + num + '}';
//    }
    
    
    


