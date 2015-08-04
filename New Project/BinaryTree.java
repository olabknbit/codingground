import java.util.Arrays;
import java.util.List;
import java.util.*;

public class BinaryTree{
    Node root = null;
    
    public BinaryTree add(Node newNode){
        if(this.root == null){
            this.root = newNode;
        }
        else{
            Node current = this.root;
            while((current.getValue() <= newNode.getValue() && current.getLeftChild() != null) || (current.getValue() > newNode.getValue() && current.getLeftChild() != null)){
                while(current.getValue() <= newNode.getValue() && current.getLeftChild() != null){
                    current = current.getLeftChild();
                }
                while(current.getValue() > newNode.getValue() && current.getRightChild() != null){
                    current = current.getRightChild();
                }
            }
            if(current.getValue() <= newNode.getValue()){
                current.setLeftChild(newNode);
            }
            else {
                current.setRightChild(newNode);
            }
        }
        return this;
        
    }
    private void goThroughTree( Map<Integer,String> list, Node current){
        if(current.getLeftChild() != null) this.goThroughTree(list,current.getLeftChild());
        list.put(current.getValue(), current.getPayload());
        System.out.println(current.getValue()+ " " + current.getPayload());
        if(current.getRightChild() != null) this.goThroughTree(list, current.getRightChild());
    }
    public Map<Integer,String> flatten() {
        Map<Integer,String> flattened = new LinkedHashMap<Integer,String>();
        this.goThroughTree(flattened, this.root);
        return flattened;
    }

}