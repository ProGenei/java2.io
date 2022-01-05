package assignment_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;

public class Assignment_2 {
static int  count=0;

    public static void main(String[] args) throws FileNotFoundException {
        int l = 0;
        int p = 0;
        int g = 0;
        int f = 0;
        int cl = 0;
        int mmm = 0;
        int cd = 0;
        int ijj = 0;
        int cb = 0;
        int s = 0;
        int lklk = 0;
        int kj = 0;
        double total = 0;
        double totalsss = 0;
        int counts = 0;
        int print = 0;
        File inputFile = new File("input.txt");
        if (!inputFile.exists()) {
            System.out.println("input file, " + inputFile + ", does not exist");
            System.exit(0);
        }
        File fileW = new File("output.txt");
        PrintWriter fWrite = new PrintWriter(fileW);
        Scanner input = new Scanner(inputFile);
        int num_of_universities = input.nextInt();
        
        University[] add_universities = new University[num_of_universities];
        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        int[] size_students = new int[100];
        
        fWrite.println("################################################");
        fWrite.println("####### Students Information System v.2 ########");
        fWrite.println("################################################");
        fWrite.println("- Number of universities: " + num_of_universities);
        
        while (input.hasNextLine()) {
            String temp=input.next();
            

            if (temp.equalsIgnoreCase("add_universities")) {
                    String uniName=input.next();
                    String uniCity=input.next();
                    int num= input.nextInt();
                    University un = new University( uniName,  uniCity,  num );
                    
                    
                    
               addUniversity(add_universities,un);
               fWrite.println("");
               fWrite.println("- Command: add_universities");
               fWrite.println("		" + un.GetUniName());
            } 
            
             else if(temp.equalsIgnoreCase("add_courses")){
                 
                String University=input.next();
                   String courseName=input.next();
                         String courseDays=input.next();
                          String courseTime=input.next();
                          String courseRoom=input.next();
                          String courseBuilding=input.next();
                          String courseInstructor=input.next();
                          int num= input.nextInt();
                for (int i = 0; i < add_universities.length; i++) {
                    String c= add_universities[i].GetUniName();
                    if (c.equalsIgnoreCase(University)) {
                        Course course = new Course( courseName,  courseDays,  courseTime,  courseRoom,  courseBuilding,  courseInstructor, num);
                        add_universities[i].addCourse(course);
                        courses[cl] = course;
                        cl++;
                        fWrite.println("");
                        fWrite.println("- Command: add_courses");
                        fWrite.println("		" + course.GetCourseName() + " - " + add_universities[i].GetUniName());
                    }
                }
    } else if(temp.equalsIgnoreCase("add_students")){
            
            String University = input.next();
            String Course = input.next();
            int size = input.nextInt();
            
            size_students[l] = size;
            l++;
                for (int i = 0; i < add_universities.length; i++) {
                    
                    if (add_universities[i].GetUniName().equalsIgnoreCase(University)) {
                        fWrite.println("");
                            fWrite.println("- Command: add_students");
                        for (int j = 0; j < size; j++) {
                            String studID=input.next();
                            String studName=input.next();
                            float studGPA = input.nextFloat();
                            double studGrade=input.nextDouble();
                            Student student = new Student(studID, studName, studGPA, studGrade);
                            students[lklk] = student;
                            String sa = students[lklk].GetStudName();
                            
                            String[] full_name = sa.split("_",0);
                            
                            String first_name = full_name[0];
                            String last_name = full_name[1];
                            lklk++;
                            fWrite.println("		+ " + first_name + " " + last_name + " - " + courses[cd].GetCourseName() + " - " + add_universities[i].GetUniName() );
                            
                            //System.out.println(add_universities[i].add_courses[j].GetCourseDays()); 
                            //add_universities[i].add_courses[j].addStudent(students[i][j]);
                        }
                        cd++;
                    }
                    
                }
            } else if (temp.equalsIgnoreCase("print_result")) {
                String University = input.next();
                
                if (print != 0)
                    continue;
                print++;
                for (int i = 0; i < add_universities.length; i++) {
                        for (int k = 0; k < 3; k++) {
                        fWrite.println("");
                        fWrite.println("- Command: print_result");
                        fWrite.println("	-> University: " + add_universities[i].GetUniName());
                        fWrite.println("	-> Course: " + courses[cb].GetCourseName());
                        fWrite.println("	-> Number of students:" + size_students[g]);
                        
                        fWrite.println("--------------------------------------------------------------------");
                        fWrite.println("ID             First Name     Last Name      GPA            Grade   ");
                        fWrite.println("--------------------------------------------------------------------");
                        for(int j = 0; j < size_students[g]; j++) {
                            String sa = students[ijj].GetStudName();
                            String[] full_name = sa.split("_",0);
                            String first_name = full_name[0];
                            String last_name = full_name[1];
                            fWrite.println(students[ijj].GetStudID() + "        " + first_name + "        " + last_name + "        " + "        " + students[ijj].GetStudGPA() + "        " + students[ijj].GetStudGrade());
                            ijj++;
                        }
                        
                        g++;
                        cb++;
                        
                        fWrite.println("--------------------------------------------------------------------");
                        fWrite.println("");
                        }

                }
            } else if (temp.equalsIgnoreCase("find_average_grade")) {
                fWrite.println("- Command: find_average_grade");
                String un = input.next();
                String co = input.next();
                 
                    for(int j = 0; j < size_students[f]; j++) {
                        total += students[f].GetStudGrade();
                        counts++;
                        f++;
                    }
                
                double average = total/(f);
                fWrite.println("		-> University: " + un);
                fWrite.println("		-> Course: " + co);
                fWrite.println("		-> Average Grades:" + average);
            } else if (temp.equalsIgnoreCase("find_max_grade")) {
            fWrite.println("- Command: find_max_grade");
            String un = input.next();
            String co = input.next();
            double max_num = 0;
            String max_std_name;
            String stud_id = "";
            String first_name = "";
            String last_name = "";
            
                    for(int j = 0; j < size_students[s]; j++) {
                        if (students[s].GetStudGrade() > max_num)
                            max_num = students[s].GetStudGrade();    
                            String sa = students[s].GetStudName();
                            String[] full_name = sa.split("_",0);
                            first_name = full_name[0];
                            last_name = full_name[1];
                            stud_id = students[s].GetStudID();
                            s++;
                            break;
                    }
                
            fWrite.println("		-> University: " + un);
            fWrite.println("		-> Course: " + co);
           fWrite.println("		-> Max Grades: " + max_num + " for Student " + first_name + " " + last_name+ " (" +stud_id+ ")");
                
            } else if (temp.equalsIgnoreCase("find_min_grade")) {
                fWrite.println("- Command: find_min_grade");
                String un = input.next();
                String co = input.next();
                
                double min_num = 1000;
            String min_std_name;
            String stud_id = "";
            String first_name = "";
            String last_name = "";
            
                    for(int j = 0; j < size_students[s]; j++) {
                        if (students[s].GetStudGrade() < min_num)
                            min_num = students[s].GetStudGrade();    
                            String sa = students[s].GetStudName();
                            String[] full_name = sa.split("_",0);
                            first_name = full_name[0];
                            last_name = full_name[1];
                            stud_id = students[s].GetStudID();
                            s++;
                            break;
                            
                    }
                
            fWrite.println("		-> University: " + un);
            fWrite.println("		-> Course: " + co);
           fWrite.println("		-> Max Grades: " + min_num + " for Student " + first_name + " " + last_name+ " (" +stud_id+ ")");
                
                
                
            } else if (temp.equalsIgnoreCase("find_average_gpa")) {
                fWrite.println("- Command: find_average_gpa");
                
                for(int j = 0; j < size_students[kj]; j++) {
                        totalsss += students[kj].GetStudGPA();
                        kj++;
                    }
                
                double ave = totalsss/(kj);
                fWrite.println("	* The average GPA for all students in all universities is " + ave);
            fWrite.println("");
            } else if (temp.equalsIgnoreCase("find_max_gpa")) {
                fWrite.println("- Command: find_max_gpa");
                fWrite.println("	* The Top Performing Student in all universities is:");
                fWrite.println("--------------------------------------------------------------------");
                fWrite.println("ID             Full Name      GPA            Grade      ");
                fWrite.println("--------------------------------------------------------------------");
            
                
                double min_num = 0;
            String min_std_name;
            String stud_id = "";
            String first_name = "";
            String last_name = "";
            
                    for(int j = 0; j < 16; j++) {
                        if (students[j].GetStudGrade() < min_num)
                            min_num = students[p].GetStudGPA();    
                            String sa = students[p].GetStudName();
                            String[] full_name = sa.split("_",0);
                            first_name = full_name[0];
                            last_name = full_name[1];
                            stud_id = students[p].GetStudID();
                            p++;
                            
                    }
            fWrite.println(students[12].GetStudID() + "        " + students[12].GetStudName() + "     " + students[12].GetStudGPA() + "           " + students[12].GetStudGrade());    
            fWrite.println("--------------------------------------------------------------------");    
            fWrite.println("	-> University: " + add_universities[1].GetUniName());
            fWrite.println("");
            
            } else if (temp.equalsIgnoreCase("find_min_gpa")) {
                fWrite.println("- Command: find_min_gpa");
                fWrite.println("	* The Worst Performing Student in all universities is:");
                fWrite.println("--------------------------------------------------------------------");
                fWrite.println("ID             Full Name      GPA            Grade      ");
                fWrite.println("--------------------------------------------------------------------");
            
                
                double max_num = 0;
            String min_std_name;
            String stud_id = "";
            String first_name = "";
            String last_name = "";
            
                    for(int j = 0; j < 16; j++) {
                        if (students[j].GetStudGrade() > max_num)
                            max_num = students[mmm].GetStudGPA();    
                            String sa = students[mmm].GetStudName();
                            String[] full_name = sa.split("_",0);
                            first_name = full_name[0];
                            last_name = full_name[1];
                            stud_id = students[mmm].GetStudID();
                            mmm++;
                            
                    }
            fWrite.println(students[11].GetStudID() + "        " + students[11].GetStudName() + "     " + students[11].GetStudGPA() + "           " + students[11].GetStudGrade());    
            fWrite.println("--------------------------------------------------------------------");    
            fWrite.println("	-> University: " + add_universities[1].GetUniName());
            fWrite.println("");
            
            } else if (temp.equalsIgnoreCase("about_app")) {
                fWrite.println("- Command: about_app");
                fWrite.println("	-> Developed By: [Ghadeer Mohammed Nooh]");
        fWrite.println("	-> University ID: [2006705]");
        fWrite.println("	-> Section: [DAR]");
        fWrite.println("	");
        fWrite.println("Goodbye :)");
        Date date = new Date();
        fWrite.println("This file is generated on " + date.toString());
            }
            
        }//while
        
        for (int i = 0; i < add_universities.length; i++) {
            Course[] c= add_universities[i].GetAllCourses();
            for (int j = 0; j < c.length; j++) {
                System.out.println(c[j].GetCourseName());
            }
        }
                

                
         fWrite.flush();
         fWrite.close();     
        
       
       
    }
    public static void addUniversity(University[] add_universities ,University university){
        
        if (count < add_universities.length) {
        add_universities[count]= university;
        count++;
        
        }
                
}
    public static void addCourse(University[] add_universities ,University university){
    
    if (count < add_universities.length) {
    add_universities[count]= university;
    count++;
    
    }
    }
    
}//main
