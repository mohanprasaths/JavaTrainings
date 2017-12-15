package test.datastructures;

public class BST {
    public static void main(String argsp[]){
        int arr[] = new int[5];
        arr = new int[]{9,2,1,4,5,0};
        BinarySearchTree bstree = new BinarySearchTree();
        bstree.buildTree(arr);
        bstree.displayTree(bstree.root);
    }
}

class BinarySearchTree{
    Node root;
    BinarySearchTree(){
        this.root = null;
    }
    void buildTree(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            insertIntoTree(arr[i], this.root);
        }
    }
    void insertIntoTree(int value,Node currentNode){
        Node newNode = this.findPreNode(value,currentNode);
        newNode.setNode(value);
    }
    Node findPreNode(int value,Node currentNode){
        if(this.root == null){
            this.root = new Node(value);
            return this.root;
        }
        if(currentNode.value > value){
            if(currentNode.left == null){
                currentNode.left = new Node(value);
                return currentNode.left;
            }
            return findPreNode(value , currentNode.left);
        }else{
           if(currentNode.right == null){
               currentNode.right= new Node(value);
               return currentNode.right;
           }
           return findPreNode(value , currentNode.right);
        }
    }
    void displayTree(Node root){
        if(root != null){
         System.out.println(root.value);
         displayTree(root.left);
         displayTree(root.right);
        }
    }
}


class Node {
    public int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    void setNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}