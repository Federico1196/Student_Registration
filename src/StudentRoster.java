import java.util.ArrayList;

/*
 *  StudentRoster manages the courses that the student has enrolled in an array; adding and removing them.
 */

public class StudentRoster extends Student{

    ArrayList<String> StudentCourses;
    public int index; 
    private String firstName;
	private String lastName;
	private String IDNo;
    int maxCourses = 10;
    

    public StudentRoster(){
        super(" ", " ", " ");
        this.firstName = " ";
        this.lastName = " ";
        this.IDNo = " ";
        index = 0; 
        StudentCourses = new ArrayList<String>();
    }

    
    public StudentRoster(String firstName, String lastName, String IDNo, String[]SC) {
        super(firstName, lastName, IDNo);
        this.StudentCourses = new ArrayList<String>();
    }

    public StudentRoster(String firstName, String lastName, String IDNo) {
		super(firstName, lastName, IDNo);
		this.StudentCourses = new ArrayList<String>();  //limit of student courses = 4
	}


    public String toString (){
        return this.getFirstN()+ " " +this.getLastN()+ " " +this.getIDNo();
    }

    void addCourse(String newCourse) {
        if(StudentCourses.size() > maxCourses){
            System.out.println("Course list is full");
        }
        else
            StudentCourses.add(newCourse);
	}
	
	void remCourse(String remCourse) {

        if(StudentCourses.isEmpty()){
            System.out.println("Course list is empty");
        }
        else
            StudentCourses.remove(remCourse);

	}

    ArrayList<String> getCourses() {
		return StudentCourses;
	}
    
    
    
}
