package assignment_2;


public class University {
    private String uniName;
    private String uniCity;
    
    private  int num;
    private int  index=0;
    
    Course[] add_courses ;
    
    public University() {
        
    }

    public University(String uniName, String uniCity,int num) {
        this.uniName = uniName;
        this.uniCity=uniCity; 
        this.num = num;
        add_courses = new Course[num];
    }
    
    
    public String GetUniName() {
        return uniName;
    }
    public String GetUniCity() {
        return uniCity;
    }
   
    public Course[] GetAllCourses() {
        return add_courses;
    }//???
    public void SetUniName(String uniName) {
        this.uniName = uniName;
    }
    public void SetUniCity(String uniCity) {
        this.uniCity = uniCity;
    }
   
    public void addCourse(Course course){
        if (index < num) {
            add_courses[index]= course;
            index++;
        }
       
       
    }

      void addStudent(Student student) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
   
    
    
    
}
