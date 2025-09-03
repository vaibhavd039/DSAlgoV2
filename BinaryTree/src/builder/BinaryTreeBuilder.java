package builder;

import iterator.BinaryTreeTraversor;
import structure.BinaryTree;

public class BinaryTreeBuilder {

    public static BinaryTree buildBasicBinaryTree(){
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);

        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);

        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        return root;
    }

    public static BinaryTree buildTreeFromArray(int [] arr) {
        return buildTree(arr, 0);
    }

    public static BinaryTree buildTree(int [] arr, int i){
        if(i>= arr.length)
            return null;
        BinaryTree node = new BinaryTree(arr[i]);
        node.left = buildTree(arr, 2*i+1);
        node.right = buildTree(arr, 2*i+2);
        return node;
    }

}
