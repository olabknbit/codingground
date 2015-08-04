import java.util.Arrays;
import java.util.List;
import java.util.*;

public class HelloWorld{
    //In this exercise you will define a BinaryTree class.  
    //Your binary tree should be composed of BinaryTreeNode objects.  
    //Each BinaryTreeNode instance has a reference to two child nodes (traditionally called left and right, or leftChild, rightChild) 
    //and a single string for its payload.  The left and/or right references may be null.  
    //If both are null, the node is a leaf node.  Your BinaryTree instance should reference a single root node (which may be null).
    //Your primary method will be called flatten.  It will take the current binary tree, starting with the root, 
    //and produce a List containing the data from all the nodes of the tree.  
    //You will also need one or more methods to build the tree to test your flattener.
   
    public static void printMyList(Map<Integer,String> list){
        for (Map.Entry<Integer,String> entry  : list.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
    public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       
       bt.add(new Node(5, "A"));
       bt.add(new Node(7, "B")); 
       bt.add(new Node(10, "C")); 
       bt.add(new Node(8, "D"));
       bt.add(new Node(2, "E"));
       bt.add(new Node(-10, "F"));
       
       Map<Integer,String> list = new LinkedHashMap<Integer,String>();
       list = bt.flatten();
       printMyList(list);
       
       
       BinaryTree test2 = new BinaryTree();
       Map<Integer,String> testList2 = new LinkedHashMap<Integer,String>();
       testList2 = test2.flatten();
       printMyList(testList2);
       
    }
}