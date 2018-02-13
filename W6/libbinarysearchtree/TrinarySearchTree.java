package com.example;

/**
 * Created by Jiang Jinjing on 2017/11/5.
 *
 * Binary Search Tree :
 * PreOrder Traversal:
 100 70 80 200 110 105 102 107 590 360
 InOrder Traversal:
 70 80 100 102 105 107 110 200 360 590
 PostOrder Traversal:
 80 70 102 107 105 110 360 590 200 100
 *
 * If we ignore the difference in ":" and "-1", the result for
 * InOrder Traversal is the same for both trees but the results
 * for the other two traversals are different.
 * This is because the two keys in the same node of a TST are printed
 * out together in pre-order and post-order traversals while in in-order
 * traversal, keys are printed in ascending order: Traverse left subtree,
 * Visit the left key of root, Traverse middle subtree, Visit the right key
 * of root, Traverse right subtree.
 * For both trees, inorder traversal return int in ascending order.
 */

public class TrinarySearchTree {

        public static  TSTNode root;
        public TrinarySearchTree(){
            this.root = null;
        }

        public void insert(int id){
            TSTNode newTSTNode = new TSTNode(id,-1);
            if(root==null){
                root = newTSTNode;
                return;
            }else if(root.data2==-1){
                root.data2=id;
            }

            TSTNode current = root;
            TSTNode parent = null;
            while(true){
                parent = current;
                if (id == current.data1||id == current.data2) {
                    return;
                }
                else {
                    if(id<current.data1){
                        current = current.left;
                        if(current==null){
                            parent.left = newTSTNode;
                            return;
                        }else if(current.data2==-1){
                            if (id<current.data1){
                                current.data2=current.data1;
                                current.data1=id;
                                return;
                            }
                            current.data2=id;
                            return;
                        }
                    }else if (id>current.data2){
                        current = current.right;
                        if(current==null){
                            parent.right = newTSTNode;
                            return;
                        }else if(current.data2==-1){
                            if (id<current.data1){
                                current.data2=current.data1;
                                current.data1=id;
                                return;
                            }
                            current.data2=id;
                            return;
                        }
                    }else {
                        current = current.middle;
                        if(current==null){
                            parent.middle = newTSTNode;
                            return;
                        }else if(current.data2==-1){
                            if (id<current.data1){
                                current.data2=current.data1;
                                current.data1=id;
                                return;
                            }
                            current.data2=id;
                            return;
                        }
                    }
                }
            }
        }

        public int search (TSTNode root, int x, int depth){
            TSTNode current = root;

            while(x!=current.data1&&x!=current.data2) {
                if (x < current.data1) {
                    current = current.left;
                }else if (current.data2!=-1&&x > current.data2) {
                    current = current.right;
                }else if (current.data2!=-1&&x > current.data1&&x < current.data2) {
                    current = current.middle;
                }
                depth++;
            }
            System.out.print("found " + x +" at depth "+ depth + " ");
            return depth;
        }

        public int findMin(TSTNode root){
            TSTNode current = root;
            while(current.left!=null){
                current = current.left;
            }
            return current.data1;
        }

        public int findMax(TSTNode root){
            TSTNode current = root;
            while(current.right!=null){
                current = current.right;
            }
            if (current.data2==-1){return current.data1;}
            return current.data2;
        }

    public void preOrder(TSTNode root){
            if(root!=null){
                System.out.print(" " + root.data1 +" "+ root.data2 + " :");
                preOrder(root.left);
                preOrder(root.middle);
                preOrder(root.right);
            }
        }

        public void inOrder(TSTNode root){
            if(root!=null){
                inOrder(root.left);
                System.out.print(" " + root.data1 +" :");
                inOrder(root.middle);
                System.out.print(" " + root.data2 +" :");
                inOrder(root.right);
            }
        }

        public void postOrder(TSTNode root){
            if(root!=null){
                postOrder(root.left);
                postOrder(root.middle);
                postOrder(root.right);
                System.out.print(" " + root.data1 +" "+ root.data2 + " :");
            }
        }

    public static void main(String[] args) {
        int[] num = {100, 200, 590, 70, 80, 360, 110, 105, 102,107};

        TrinarySearchTree t = new TrinarySearchTree();

        for (int i = 0; i < num.length; i++) {
             t.insert(num[i]);
        }
        System.out.println("\nPreOrder Traversal: ");
        t.preOrder(t.root);
        System.out.println("\nInOrder Traversal: ");
        t.inOrder(t.root);
        System.out.println("\nPostOrder Traversal: ");
        t.postOrder(t.root);

        System.out.println();
        t.search(t.root, 100, 0);
        t.search(t.root, 590, 0);
        t.search(t.root, 107, 0);

        System.out.println();
        System.out.println("Minimum value: " + t.findMin(t.root));
        System.out.println("Maximum value: " + t.findMax(t.root));


    }


}
class TSTNode{
    int data1;
    int data2;
    TSTNode left;
    TSTNode middle;
    TSTNode right;
    public TSTNode(int data1,int data2){
        this.data1 = data1;
        this.data2 = data2;
        left = null;
        middle = null;
        right = null;
    }
}