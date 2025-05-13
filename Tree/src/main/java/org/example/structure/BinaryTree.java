package org.example.structure;

public class BinaryTree {
   private BinaryTree left;
    private BinaryTree right;
    private int data;


    public BinaryTree(int data){
        this.data= data;
        left=null;
        right= null;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
