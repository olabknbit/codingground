public class Node{
        Node left;
        Node right;
        int value;
        String payload;
        public Node(int value){
            this.left = null;
            this.right = null;
            this.value = value;
            this.payload = "0";
        }
        public Node(int value, String payload){
            this.left = null;
            this.right = null;
            this.value = value;
            this.payload = payload;
        }
        /*Getters*/
        public Node getLeftChild(){
            return this.left;
        }
        public Node getRightChild(){
            return this.right;
        }
        public int getValue(){
            if(this == null){
                throw new IllegalArgumentException("return value is null at method getValue");  
            } 
            return this.value;
        }
        public String getPayload(){
             if(this == null) throw new IllegalArgumentException("return value is null at method getPayload");
            return this.payload;
        }
        /*Setters*/
        public void setLeftChild(Node node){
            this.left = node;
        }
        public void setRightChild(Node node){
            this.right = node;
        }
        
}