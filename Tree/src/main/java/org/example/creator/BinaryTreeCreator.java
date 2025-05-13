package org.example.creator;

import org.example.structure.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeCreator {

    public static BinaryTree createNumericBinaryTree(List<Integer> elements) {
        if (elements == null || elements.isEmpty()) {
            return null;
        }

        BinaryTree root = new BinaryTree(elements.get(0));
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (index < elements.size() && !queue.isEmpty()) {
            BinaryTree current = queue.poll();

            // Add left child
            if (index < elements.size()) {
                BinaryTree left = new BinaryTree(elements.get(index++));
                current.setLeft(left);
                queue.offer(left);
            }

            // Add right child
            if (index < elements.size()) {
                BinaryTree right = new BinaryTree(elements.get(index++));
                current.setRight(right);
                queue.offer(right);
            }
        }

        return root;
    }


    public static BinaryTree createNumericBinaryTree(int [] array, int i){
        if(i>=array.length){
            return null;
        }
        BinaryTree node = new BinaryTree(array[i]);
        BinaryTree left = createNumericBinaryTree(array, 2*i+1);
        node.setLeft(left);
        BinaryTree right = createNumericBinaryTree(array, 2*i+2);
        node.setRight(right);
        return node;
    }
}
