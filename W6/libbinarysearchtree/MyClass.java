package com.example;

public class MyClass {

    public static void main(String[] args) {
        int[] num = {100, 200, 590, 70, 80, 360, 110, 105, 102,107};


        BinarySearchTree b = new BinarySearchTree();

        for (int i = 0; i < num.length; i++) {
            b.insert(num[i]);
        }
        System.out.println("\nPreOrder Traversal: ");
        b.preOrder(b.root);
        System.out.println("\nInOrder Traversal: ");
        b.inOrder(b.root);
        System.out.println("\nPostOrder Traversal: ");
        b.postOrder(b.root);
    }

}

