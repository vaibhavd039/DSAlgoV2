package org.example.basic;

import org.example.creator.BinaryTreeBuilder;
import org.example.structure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOfTree {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.createSortedTree();
        System.out.println(getMaxDepth(root));
    }

    public static int getMaxDepthRec(BinaryTree root){
        if(root==null){
            return -1;
        }
        return 1+Math.max(getMaxDepthRec(root.getLeft()),getMaxDepthRec(root.getRight()));
    }

    public static int getMaxDepth(BinaryTree root) {
        if (root == null) {
            return -1;
        }
        int level = -1;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            //this will be number of nodes of that level
            for (int i = 0; i < size; i++) {
                BinaryTree temp = queue.poll();
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.offer(temp.getRight());
                }
            }
            level++;
        }
        return level;
    }
}
