package com.example;

/**
 * Created by jit_biswas on 10/15/2017.
 */

public class BinarySearchTree {
    public static  Node root;
    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int id){
        Node newNode = new Node(id);// Create a new Node and initialize it
        if(root==null){// If there is no root this becomes root
            root = newNode;
            return;
        }
        // Set root as the Node we will start
        // with as we traverse the tree
        Node current = root;

        // Future parent for our new Node
        Node parent = null;

        while(true){
            parent = current;// root is the top parent so we start there
            if (id == current.data) {
                return;
            }
            else {
                // Check if the new node should go on
                // the left side of the parent node
                if(id<=current.data){
                    // Switch focus to the left child
                    current = current.left;
                    if(current==null){
                        // then place the new node on the left of it
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    // If the right child has no children
                    if(current==null){
                        // then place the new node on the right of it
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preOrder(Node root){
        if(root!=null){
            System.out.print(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

}

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

