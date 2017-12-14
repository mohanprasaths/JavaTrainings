package test.datastructures;

public class BST {

}

class BinarySearchTree{
    Node root;
    BinarySearchTree(int arr[]){
        this.root = null;
    }
    insertIntoTree(int value,Node currentNode){
        if(this.root == null){
            this.root.value = value;
            return;
        }
        if(value > currentNode.value){
            if(currentNode.right == null){
                currentNode.right = new Node(value);
            }else{
                this.insertIntoTree(value,currentNode.right);
            }
            return;
        }
        if(value < currentNode.value){
            if(currentNode.left == null){
                currentNode.left = new Node(value);
            }else{
                this.insertIntoTree(value,currentNode.left);
            }
            return;
        }
    }
}


class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}