package iterator;

import structure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversor {

    public static void inOrderTraversal(BinaryTree root){
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.data + "\t");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(BinaryTree root){
        if(root==null)
            return;;
            System.out.println(root.data + "\t");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(BinaryTree root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data + "\t");
    }

    public static void  levelOrderTraversal(BinaryTree root){
        if(root==null)
            return;;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree temp = queue.poll();
            if(temp==null)
                continue;
            System.out.println(temp.data);
            queue.add(temp.left);
            queue.add(temp.right);

        }
    }
}
