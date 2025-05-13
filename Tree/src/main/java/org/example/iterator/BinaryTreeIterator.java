package org.example.iterator;

import org.example.structure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeIterator {
    public static  void preOrderTraversal(BinaryTree root){
        if(root==null){
            return;
        }
        System.out.print(root.getData()+"\t");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    public static void inOrderTraversal(BinaryTree root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.getLeft());
        System.out.print(root.getData()+"\t");
        inOrderTraversal(root.getRight());
    }

    public static void postOrderTraversal(BinaryTree root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getData()+"\t");
    }


    public static void levelOrderTraversal(BinaryTree root){
        if(root==null){
            return;
        }
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryTree temp = queue.poll();
            if(temp==null) {
                continue;
            }
            System.out.print(temp.getData()+"\t");
            queue.offer(temp.getLeft());
            queue.offer(temp.getRight());
        }
    }
}
