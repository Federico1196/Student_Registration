
public class Course {
    
    // **** Main Attributes ****
    public String courseName;
    public String courseNumber;       //its 4 digits 0001
   

    // **** Constructor ****

    public Course (String courseName, String courseNumber){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }


    // *** Setters and getters  ***

    void setCourseName(String nCourseName){
        this.courseName = nCourseName;
    }

    void setCourseNum(String nCourseNumber){
        this.courseNumber = nCourseNumber;
    }

    String getCourseName(){
        return courseName;
    }

    String getCourseNum(){
        return courseNumber;
    }

    
   
      
    


}
