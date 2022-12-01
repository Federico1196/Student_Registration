

public class LLNode {
    
    StudentRoster data;
    LLNode right, left;

    //****************Contructor*****************

    public LLNode(){
        this.data = new StudentRoster();
        this.right = null;
        this.left = null;
    }


    public LLNode(StudentRoster data){
        this.data = data;
        this.right = null;  //starts the empty tree
        this.left = null;
    }
/*
    public LLNode (String data, LLNode next){
        this.data = data;
        this.next = next;
    }*/

    //*****************Setters and getters******************

    // public LLNode(Student obj, LLNode curr) {
    // }

    public void setData(StudentRoster data){
        this.data = data;
    }

    public void setNextRight(LLNode right){
        this.right = right;
    }

    public void setNextLeft(LLNode left){
        this.left = left;
    }

    public StudentRoster getData(){
        return this.data;
    }

    public LLNode getNextRight(){
        return this.right;
    }

    public LLNode getNextLeft(){
        return this.left;
    }

    //********** toString ******* */
    public String toString() {
        return data.toString();
	}

}
