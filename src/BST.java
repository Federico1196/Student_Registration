
import java.util.ArrayList;


public class BST{

    LLNode root; 
    int size = 0;
  
   // Constructotr
    BST(){ 
        root = null; 
    } 

    public boolean isEmpty(){
        return root == null;
    }

    //delete a node
    public void delete_Recursive(StudentRoster student) { 
        root = delete_Recursive(root, student); 
    } 
   
    //delete function
    private LLNode delete_Recursive(LLNode root, StudentRoster student)  { 
        if (root == null)  return root; 
   
        //traverse the tree
        if (student.compareTo(root.data) < 0)     //traverse left subtree 
            delete_Recursive(root.left, student);
        else if (student.compareTo(root.data) > 0)  //traverse right subtree
            delete_Recursive(root.right, student);
        else  { 
            // node contains only one child
            if (root.left == null){
                size--; 
                return root.right; 
            }
            else if (root.right == null){
                size--;
                return root.left; 
            }
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.data = findMax(root.left); 
   
            // Delete the inorder successor 
            root.left = delete_Recursive(root.left, root.data); 
        } 
        return root; 
    } 



    StudentRoster findMax(LLNode root){
        if (isEmpty()){
            System.out.println("List is empty");
        }
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }
   
    StudentRoster findMin(LLNode root)  { 
        if (isEmpty()){
            System.out.println("List is empty");
        }
        while (root.left != null){
            root = root.left;
        }
        return root.data; 
    } 
   
    // insert a node in BST 
    public void insert_Recursive(StudentRoster student)  { 
        if (isEmpty()){
            root = new LLNode(student);
            size++;
        }
        insert_Recursive(root, student);
    } 
   
    //recursive insert function
    private void insert_Recursive(LLNode root, StudentRoster student) {  //private so it can access only in the class
          //tree is empty
        if (root != null) { 
            if(student.compareTo(root.data) < 0){
                if (root.left == null){
                    root.left = new LLNode(student);
                    size++;
                }
                else 
                    insert_Recursive(root.left, student);
            }
            else if (student.compareTo(root.data) > 0 ){
                if(root.right == null){
                    root.right = new LLNode(student);
                    size++;
                }
                else
                    insert_Recursive(root.right, student);
            }
        } 
    }
       
 
// method for inorder traversal of BST 
    public String inorder_Recursive() { 
         ArrayList<String> var = new ArrayList<String>();
         ArrayList<String> temp = inorder_Recursive(root, var);
         String retStr = "";
         for(int i = 0; i < size; i++){
            retStr += temp.get(i); // get.() gets the data from the index 
            if(i != size-1){
                retStr += "\n";
            }
        }
        return retStr;

    } 
   
    // recursively traverse the BST  
    private ArrayList<String> inorder_Recursive(LLNode root, ArrayList<String> arr) { 
        if (root != null) {    
            inorder_Recursive(root.left, arr); 
            arr.add(root.data.toString());
            inorder_Recursive(root.right, arr); 
        } 
        return arr;
    } 
     
    public StudentRoster search_Recursive(StudentRoster student)  { 
        if (isEmpty()){
            System.out.println("List is empty");
        }
        return search_Recursive(root, student);
            
    } 
   
    //insert function
    private StudentRoster search_Recursive(LLNode root, StudentRoster student)  { 
        // Base Cases: root is null or key is present at root 
        if (root == null) {
            System.out.println("Student is not in record");
            return null;
        }

        if (student.compareTo(root.data) < 0){
            return search_Recursive(root.left, student);

        } 
        if (student.compareTo(root.data) > 0){
            return search_Recursive(root.right, student);
        }
        return root.data;
    } 

    public String toString(){
        return inorder_Recursive();
    }
}
