
class Student implements Comparable<Student>{
    
    // ********* Main attributes *************

    public String firstName;
    public String lastName;
    public String IDNo; 


    // ********** Array of couses ************

    public String courseArray[];   // limit of 4 courses 


    // ************ Constructor ***********

    public Student ( String firstName,  String lastName, String IDNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNo = IDNo;
        this.courseArray = new String[4];
    }

    
    //  ************ Setters and Getters **************

    void setFirstN(String nFirst){
        firstName = nFirst;
    }

    void setLastN(String nLast){
        lastName = nLast;
    }

    void setIDNo(String nIDNo){
        IDNo = nIDNo;
    }

    String getFirstN(){
        return firstName;
    }

    String getLastN(){
        return lastName;
    }

    String getIDNo(){
        return IDNo;
    }

    
    // ************ Equal to Method **************

    /*   NOTE: This Method needs to compare the ID 
    *          number of students in the student record 
     
    
    
    */

    public boolean equalsTo (Student obj) {
        if(obj.IDNo == this.IDNo){
            return true;
        }

        return false;
        
    }



    /*  ********************* Compare to Method ***********************

         NOTE: This Method will compare the last 
    *          name them the first name of a student and 
    *          see if there is a match with a Student on the Studen Record
    */ 

    @Override
    public int compareTo(Student obj) {
        
        int studentObj = this.getLastN().compareTo(obj.getLastN());            //compares the obj last name 
        if (studentObj != 0){
                return studentObj;
        }

        studentObj = this.getFirstN().compareTo(obj.getFirstN());              //compares the obj first name 
        if (studentObj != 0){
                return studentObj;
        }

        return this.getIDNo().compareTo(obj.getIDNo());
    }


    // *********************** To String Method **************************
    
    public String toString (String firstName, String lastName) {
		return firstName+ " " +lastName+ ", ID:" +IDNo;
	}


}

