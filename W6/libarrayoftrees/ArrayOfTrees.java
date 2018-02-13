package com.example;

public class ArrayOfTrees {
    public Node root;
    public ArrayOfTrees(){
        this.root = null;
    }

    public void insert(String s){
        Node newNode = new Node(s);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if (s.equals(current.data)) {
                current.count+=1;
                return;
            }
            else {
                if(s.compareTo(current.data)==-1){
                    current = current.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }



    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(" " + root.data + " (" + root.count + ")");
            inOrder(root.right);
        }
    }


    public static void main(String[] args) {

        ArrayOfTrees[] arr = new ArrayOfTrees[26];
        String S = "This is a piece of text from which hopefully you will make some trees.";

        String[] words = S.split(" ");

        for (String word:words){

            char firstchar = word.charAt(0);
            char first = Character.toLowerCase(firstchar);
            if ( (int) 'a' >(int)first||(int)'z' <(int)first){
                continue;
            }
            if (arr[(int)first -(int) 'a']!= null){
                arr[(int)first -(int) 'a'].insert(word);

            }else {
                arr[(int) first - (int) 'a'] = new ArrayOfTrees();
                arr[(int) first - (int) 'a'].insert(word);

            }
        }

        for (ArrayOfTrees tree:arr) {
           if (tree!=null){
             System.out.println("\nInOrder Traversal: ");
               tree.inOrder(tree.root);
          }
       }
    }
}

class Node{
    String data;
    int count;
    Node left;
    Node right;
    public Node(String data){
        this.data = data;
        left = null;
        right = null;
        count=1;
    }
}
