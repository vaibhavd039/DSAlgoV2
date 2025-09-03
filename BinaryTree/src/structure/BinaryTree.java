package structure;

public class BinaryTree {
    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(){}

    public BinaryTree(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
