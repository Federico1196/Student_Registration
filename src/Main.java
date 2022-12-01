import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception  {
       
        int input = 0;
        int rosterCount = 0;
        int rosterMax = 30;
        BST arrBst = new BST();
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
            

        do {
            System.out.println("Welcome! Select from the following options: ");
            System.out.println("1. Add a student");
            System.out.println("2. Drop a student");
            System.out.println("3. Search for a student in the record");
            System.out.println("4. Print current roster");
            System.out.println("5. Close");
            
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter the first name of the student: ");
                    String firstn = sc.next();
                    System.out.println("Enter the last name of the student: ");
                    String lastn = sc.next();
                    System.out.println("Enter the ID number of the student: ");
                    String idn = sc.next();

                    //creates the new student obj 
                    StudentRoster newStudent = new StudentRoster(firstn, lastn, idn);
                    

                    //adding courses for student 
                    System.out.println("Adding courses for this student ");
                    System.out.println("Do you want to add courses for this student? type y for yes or any other key to continue");
                    String addOpt = scan1.next();
                    if (addOpt.equals("y")){
                        System.out.println(" Instructions: type the student course then a comma , to separeta courses. Only 4 allowed");
                        String addC = scan.next();
                        String[] courses = addC.split(",");
                        for(int i=0; i < courses.length; i++) {
                            newStudent.addCourse(courses[i]);
                        }
                    }
                    
                    if (rosterCount < rosterMax){
                        arrBst.insert_Recursive(newStudent);
                        rosterCount++;
                        System.out.println(" Student has been added ");
                    }
                    else 
                        System.out.println("Class is full");

                    break;

                
            
                case 2:
                    System.out.println("Enter the first name of the student: ");
                    String fn = sc.next();
                    System.out.println("Enter the last name of the student: ");
                    String ln = sc.next();
                    System.out.println("Enter the ID number of the student: ");
                    String id = sc.next();

                    //creates the new student obj
                    StudentRoster dropStudent = new StudentRoster(fn, ln, id);
                    
                    if (arrBst.search_Recursive(dropStudent) == null){
                        System.out.println("Student not found");
                    }
                    else {
                        arrBst.delete_Recursive(dropStudent);
                        System.out.println(dropStudent+" has been deleted");
                    }

                    break;
                
              
            
                case 3:
                    System.out.println("Enter the first name of the student: ");
                    String first = sc.next();
                    System.out.println("Enter the last name of the student: ");
                    String last = sc.next();
                    System.out.println("Enter the ID number of the student: ");
                    String i = sc.next();

                    //creates the new student obj
                    StudentRoster searchStudent = new StudentRoster(first, last, i);
                    StudentRoster temp = arrBst.search_Recursive(searchStudent);


                    if (temp == null){
                        System.out.println("Student not found"); 
                    }
                    else {
                        System.out.println("Student is registerd");
                    }
                    
                    break;
                
               
        
                case 4:
                    System.out.println(arrBst.toString());
    
                    break;
                 
            
                case 5:
		            System.out.println("Program Exited.");
                    
                    break;

        } 
        
        } while(input != 5);
    }
}
